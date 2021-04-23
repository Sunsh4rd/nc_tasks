package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private static List<String> shop = Collections.synchronizedList(new ArrayList<>());

    public static List<String> getShop() {
        return shop;
    }
}