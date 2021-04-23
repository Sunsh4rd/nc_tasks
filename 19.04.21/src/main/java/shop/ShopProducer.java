package shop;

public class ShopProducer implements Runnable {

    @Override
    public void run() {
        Shop.getShop().add("Product");
    }
}
