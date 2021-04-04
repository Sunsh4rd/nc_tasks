package prodcon;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static prodcon.Shop.shop;

public class Parent {

    public static Supplier<String> parentSupplier = () -> String.valueOf(shop.add("Phone"));
    public static Consumer<String> parentConsumer = (s) -> shop.remove(s);
}
