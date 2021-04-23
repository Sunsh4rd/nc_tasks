import stock.Stock;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Random random = new Random();
                int opt = random.nextInt(3);
                int money = random.nextInt(20);
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
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
