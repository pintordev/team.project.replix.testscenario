package com.application;

public class Client {
    private static int clientuserId = -1;

    public static boolean getLogFlag() {
        if (clientuserId == -1) return false;
        return true;
    }
    public static void login(int userId) {
        clientuserId = userId;
    }

    public static void logout() {
        clientuserId = -1;
    }

    public static int getClientuserId() {
        return clientuserId;
    }
}
