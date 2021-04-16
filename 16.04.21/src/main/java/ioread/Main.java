package ioread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("src/main/resources/somefle.txt");
            byte[] buffer = new byte[1024];
            inputStream.read(buffer, 0, buffer.length);
            String result = new String(buffer);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
