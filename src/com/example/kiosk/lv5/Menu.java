package com.example.kiosk.lv5;

import java.util.List;

public class Menu {

    private final String categoryName;
    private final List<MenuItem> menuItems;

    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    public void printMenuItems() {
        System.out.println("[ " + categoryName + " MENU ]");
        int number = 1;
        for (MenuItem item : menuItems) {
            System.out.println(number + ". " + item);
            number++;
        }
        System.out.println("0. 뒤로가기");
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
