package com.example.kiosk.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem ShackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItems.add(ShackBurger);
        MenuItem SmokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menuItems.add(SmokeShack);
        MenuItem Cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menuItems.add(Cheeseburger);
        MenuItem Hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        menuItems.add(Hamburger);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            int number = 1;
            for (MenuItem menuItem : menuItems) {
                System.out.println(number + ". " + menuItem);
                number++;
            }
            System.out.println("0. 종료      | 종료");

            System.out.println("번호를 입력하세요");
            int menuOrder = sc.nextInt();

            if (menuOrder == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menuOrder < 0 || menuOrder > menuItems.size()) {
                System.out.println("다시 입력해주세요");
                continue;
            }
            MenuItem selectMenu = menuItems.get(menuOrder - 1);
            System.out.println("프로그램을 종료합니다.");
            System.out.println("선택된 메뉴: " + selectMenu);
            break;
        }
    }
}
