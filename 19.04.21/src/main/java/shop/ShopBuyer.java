package shop;

public class ShopBuyer implements Runnable {

    @Override
    public void run() {
        Shop.getShop().remove(Shop.getShop().size()-1);
    }
}
