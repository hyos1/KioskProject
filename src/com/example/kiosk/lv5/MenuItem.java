package com.example.kiosk.lv5;

public class MenuItem {

    private final String menuName;
    private final double price;
    private final String menuInfo;

    public MenuItem(String menuName, double price, String menuInfo) {
        this.menuName = menuName;
        this.price = price;
        this.menuInfo = menuInfo;
    }

    @Override
    public String toString() {
        return menuName + " | W " + price + " | "
                + menuInfo;
    }
}
