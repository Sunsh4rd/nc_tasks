import shop.Shop;
import shop.ShopBuyer;
import shop.ShopProducer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 15; i++) {
            Thread producer = new Thread(new ShopProducer());
            producer.start();
        }

        System.out.println(Shop.getShop());

        for (int i = 0; i < 10; i++) {
            Thread buyer = new Thread(new ShopBuyer());
            buyer.start();
            buyer.join();
        }

        System.out.println(Shop.getShop());
    }
}
