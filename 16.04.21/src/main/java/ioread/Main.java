package ioread;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("src/main/resources/somefile.txt");
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length));
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new URL("https://ru.wikipedia.org/wiki/%D0%9A%D0%B8%D1%82%D0%B0%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D0%BC%D0%BE%D0%BD%D0%B0%D0%BB").openStream()){
            OutputStream outputStream = new FileOutputStream("src/main/resources/out.txt");
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
