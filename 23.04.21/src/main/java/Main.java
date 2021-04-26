import stock.Stock;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        File file = new File("src/main/resources");
//        File[] files = file.listFiles();
        stock();
    }

    private static void stock() {
        Stock stock = new Stock();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Random random = new Random();
                int opt = random.nextInt(3);
                int money = random.nextInt(20);
                System.out.println(stock.getDollarCount().get());
                System.out.println(stock.getEuroCount().get());
                System.out.println(stock.getRoubleCount().get());
                switch (opt) {
                    case 0:
                        stock.exchangeED(money);
                        break;
                    case 1:
                        stock.exchangeRD(money);
                        break;
                    case 2:
                        stock.exchangeRE(money);
                        break;
                }
                System.out.println(stock.getDollarCount().get());
                System.out.println(stock.getEuroCount().get());
                System.out.println(stock.getRoubleCount().get());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
