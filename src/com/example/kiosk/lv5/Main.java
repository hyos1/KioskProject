package com.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //버거 리스트
        List<MenuItem> burgerList = new ArrayList<>();
        burgerList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu burgerMenu = new Menu("Burgers", burgerList);

        List<Menu> menuList = new ArrayList<>();
        menuList.add(burgerMenu);


        System.out.println();
        //음료 리스트
        List<MenuItem> drinkList = new ArrayList<>();
        drinkList.add(new MenuItem("코카콜라", 2.0, "근본"));
        drinkList.add(new MenuItem("사이다", 1.5, "청량감 최고"));
        drinkList.add(new MenuItem("스프라이트", 2.0, "사이다 신흥강자"));
        drinkList.add(new MenuItem("환타", 1.2, "어린이들 친구 음료"));
        Menu drinkMenu = new Menu("Drinks", drinkList);

        menuList.add(drinkMenu);

        //디저트 리스트
        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        desserts.add(new MenuItem("Cookie", 2.0, "초코칩 쿠키"));
        Menu dessertsMenu = new Menu("Desserts", desserts);
        menuList.add(dessertsMenu);

        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();
    }
}
