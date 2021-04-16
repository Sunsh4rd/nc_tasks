package ui;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserInterface {

    private Map<Integer, MenuElement> menuAddOrder = new LinkedHashMap<>(2, 0.75f, false) {{
        put(1, new MenuElement("Добавить пункт меню."));
        put(2, new MenuElement("Изменить порядок пунктов меню."));
    }};

    private Map<Integer, MenuElement> menuAccessOrder = new LinkedHashMap<>(2, 0.75f, true) {{
        put(1, new MenuElement("Добавить пункт меню."));
        put(2, new MenuElement("Изменить порядок пунктов меню."));
    }};

    private int menuElementsCount = 2;
    private boolean accessOrder = false;

    public void setMenuElementsNameByKey(int key, String name) {

            menuAccessOrder.put(key, new MenuElement(name));
            menuAddOrder.put(key, new MenuElement(name));
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        if (accessOrder) {
            for (Integer key : menuAccessOrder.keySet()) {
                String element = key + ". " + menuAccessOrder.get(key) + "\n";
                s.append(element);
            }
        } else {
            for (Integer key : menuAddOrder.keySet()) {
                String element = key + ". " + menuAddOrder.get(key) + "\n";
                s.append(element);
            }
        }
        return String.valueOf(s);
    }

    public void interact(int option) {

        switch (option) {
            case 1:
                menuAddOrder.put(++menuElementsCount,
                        new MenuElement("Новый созданный пункт меню "
                                       + String.valueOf(menuElementsCount - 2) + "."));
                menuAccessOrder.put(menuElementsCount,
                        new MenuElement("Новый созданный пункт меню "
                                + String.valueOf(menuElementsCount - 2) + "."));
                break;
            case 2:
                accessOrder = !accessOrder;
        }
    }
}
