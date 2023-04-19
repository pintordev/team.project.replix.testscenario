package com.application;

import com.application.content.controller.ContentController;
import com.application.system.controller.SystemController;
import com.application.user.controller.UserController;

public class App {
    public static void run() {
        SystemController systemController = new SystemController();
        UserController userController = new UserController();
        ContentController contentController = new ContentController();

        while(true) {
            systemController.menu();

            switch(systemController.getCommand()) {
                case "종료":
                    systemController.exit();
                    return;
                case "로그인":
                    userController.login();
                    break;
                case "로그아웃":
                    userController.logout();
                    break;
                case "회원가입":
                    userController.signUp();
                    break;
                case "마이페이지":
                    userController.myPage();
                    break;
                case "컨텐츠검색":
                    contentController.search();
                    break;
                default:
                    systemController.commandError();
                    break;
            }
        }
    }
}
