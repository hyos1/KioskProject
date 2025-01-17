package com.example.kiosk.lv4;

public class MenuItem {

    private String menuName;
    private double price;
    private String menuInfo;

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
