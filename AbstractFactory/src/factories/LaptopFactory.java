package factories;

import keyboards.Keyboard;
import keyboards.LaptopKeyboard;
import screens.LaptopScreen;
import screens.Screen;

public class LaptopFactory implements DeviceFactory {

    @Override
    public Keyboard createKeyboard() {
        return new LaptopKeyboard();
    }

    @Override
    public Screen createScreen() {
        return new LaptopScreen();
    }
}
