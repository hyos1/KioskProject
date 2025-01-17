package com.example.kiosk.lv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

//    List<MenuItem> menuItems = new ArrayList<>();

    private String menuName;
    private double price;
    private String menuInfo;

    public MenuItem(String menuName, double price, String menuInfo) {
        this.menuName = menuName;
        this.price = price;
        this.menuInfo = menuInfo;
    }

//    public void addMenuItem(MenuItem menuItem) {
//        menuItems.add(menuItem);
//    }

    @Override
    public String toString() {
        return menuName + " | W " + price + " | "
                + menuInfo;
    }
}
