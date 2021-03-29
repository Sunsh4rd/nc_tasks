package app;

import factories.DeviceFactory;
import keyboards.Keyboard;
import screens.Screen;

public class Application {

    private Keyboard keyboard;
    private Screen screen;

    public Application(DeviceFactory factory) {
        this.keyboard = factory.createKeyboard();
        this.screen = factory.createScreen();
    }

    public void typeAndFlash() {
        this.keyboard.type();
        this.screen.flash();
    }
}
