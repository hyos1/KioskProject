package com.example.kiosk.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final List<MenuItem> menuList;

    public Kiosk(List<MenuItem> menu) {
        this.menuList = menu;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            int number = 1;
            for (MenuItem menuItem : menuList) {
                System.out.println(number + ". " + menuItem);
                number++;
            }
            System.out.println("0. 종료      | 종료");

            System.out.println("번호를 입력하세요");
            int menuOrder = sc.nextInt();

            if (menuOrder == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menuOrder < 0 || menuOrder > menuList.size()) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요");
                continue;
            }
            MenuItem selectMenu = menuList.get(menuOrder - 1);
            System.out.println("선택된 메뉴: " + selectMenu);
            break;
        }
    }
}
