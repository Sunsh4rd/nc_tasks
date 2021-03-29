package factories;

import keyboards.Keyboard;
import screens.Screen;

public interface DeviceFactory {

    Keyboard createKeyboard();
    Screen createScreen();
}
