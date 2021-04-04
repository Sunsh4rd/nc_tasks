package prodcon;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static prodcon.Shop.shop;

public class Kid {

    public static Supplier<String> kidSupplier = () -> String.valueOf(shop.add("Drawing"));
    public static Consumer<String> kidConsumer = (s) -> {while (shop.remove(s)) {}};
}
