package com.example.kiosk.lv5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = 1;
            System.out.println("[ MAIN MENU ]");
            for (Menu menu : menus) {
                System.out.println(number + "." + menu.getCategoryName());
                number++;
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("메뉴를 선택하세요: ");

            int mainMenu = sc.nextInt();
            if (mainMenu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (mainMenu < 0 || mainMenu > menus.size()) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요");
                continue;
            }

            Menu selectedMenu  = menus.get(mainMenu - 1);
            selectedMenu.printMenuItems();
            int chooseMenu = sc.nextInt();

            if (chooseMenu == 0) {
                continue;
            } else if (chooseMenu > 0 && chooseMenu <= selectedMenu.getMenuItems().size()) {
                MenuItem menuItem = selectedMenu.getMenuItems().get(chooseMenu - 1);
                System.out.println("선택한 메뉴: " + menuItem);
            } else {
                System.out.println("잘못된 값입니다.");
            }
//            chooseMenu < menus.size()
        }
    }
}
