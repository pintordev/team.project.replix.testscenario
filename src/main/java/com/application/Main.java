package com.application;

public class Main {
    public static void main(String[] args) {
        Container.init();
        App.run();
        Container.close();
    }
}