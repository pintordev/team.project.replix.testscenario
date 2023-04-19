package com.application.system.controller;

import com.application.Client;
import com.application.Container;

public class SystemController {
    public void menu() {
        int menuCount = 1;
        System.out.println("-".repeat(24));
        System.out.println("       [ REPLIX ]       ");
        if (Client.getLogFlag()) {
            System.out.printf("  %d. 로그아웃\n", menuCount++);
            System.out.printf("  %d. 마이페이지\n", menuCount++);
            System.out.printf("  %d. 컨텐츠검색\n", menuCount++);
        }
        if (!Client.getLogFlag()) {
            System.out.printf("  %d. 로그인\n", menuCount++);
            System.out.printf("  %d. 회원가입\n", menuCount);
        }
        System.out.println("  0. 종료");
    }

    public String getCommand() {
        System.out.println("-".repeat(24));
        System.out.printf("  >> ");
        return Container.getScanner().nextLine().trim();
    }

    public void exit() {
        System.out.println("-".repeat(24));
        System.out.println("  REPLIX 앱을 종료합니다.");
        Client.logout();
    }

    public void commandError() {
        System.out.println("-".repeat(24));
        System.out.println("  올바르지 않은 입력입니다.");
    }
}
