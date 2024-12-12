package Java102;

import java.util.ArrayList;

import Java102.Library.LibraryItem;

public class Main {
    public static void returnAll(LibraryItem[] items) {
        for (int i = 0; i < items.length; i ++) {
            items[i].returnItem();
        }
    }
    
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> Available_items = new ArrayList<>();
        for (int i = 0; i < items.length; i ++) {
            if (items[i].available()) {
                Available_items.add(items[i]);
            }
        }
        return Available_items;
    }
}