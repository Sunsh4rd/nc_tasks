package prodcon;

import static prodcon.Shop.shop;

public class ProducerConsumerRunner {

    public static void run() {

        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();
        Kid.kidSupplier.get();
        Parent.parentSupplier.get();

        System.out.println(shop);
        Parent.parentConsumer.accept("Phone");
        System.out.println(shop);
        Kid.kidConsumer.accept("Phone");
        System.out.println(shop);
        Kid.kidConsumer.accept("Drawing");
        System.out.println(shop);
    }
}
