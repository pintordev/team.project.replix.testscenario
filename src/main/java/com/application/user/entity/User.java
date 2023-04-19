package com.application.user.entity;

public class User {
    private int id;
    private String loginId;
    private String loginPw;
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String gender;
    private String email;

    public User(int id, String loginId, String loginPw, String name, String[] birthDateBits, String gender, String email) {
        this.id = id;
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
        this.birthYear = Integer.parseInt(birthDateBits[0]);
        this.birthMonth = Integer.parseInt(birthDateBits[1]);
        this.birthDay = Integer.parseInt(birthDateBits[2]);
        this.gender = gender;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return this.birthYear + "-" + this.birthMonth + "-" + this.birthDay;
    }
}
