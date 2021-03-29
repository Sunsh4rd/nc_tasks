package alkr;

import app.Application;
import factories.DeviceFactory;
import factories.LaptopFactory;
import factories.PCFactory;

public class Main {

    private static Application configure(String productName) {

        Application app;
        DeviceFactory factory;

        if (productName.equalsIgnoreCase("PC")) {
            factory = new PCFactory();
        }
        else {
            factory = new LaptopFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {

        String pc = "PC";
        String laptop = "Laptop";

        Application pcApp = configure(pc);
        Application laptopApp = configure(laptop);

        pcApp.typeAndFlash();
        laptopApp.typeAndFlash();
    }
}
