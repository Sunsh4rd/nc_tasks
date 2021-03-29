package factories;

import keyboards.Keyboard;
import keyboards.PCKeyboard;
import screens.PCScreen;
import screens.Screen;

public class PCFactory implements DeviceFactory {

    @Override
    public Keyboard createKeyboard() {
        return new PCKeyboard();
    }

    @Override
    public Screen createScreen() {
        return new PCScreen();
    }
}
