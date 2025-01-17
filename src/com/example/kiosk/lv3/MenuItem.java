package com.example.kiosk.lv3;

public class MenuItem {

//    List<MenuItem> menuItems = new ArrayList<>();

    private final String menuName;
    private final double price;
    private final String menuInfo;

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
