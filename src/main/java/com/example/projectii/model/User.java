package com.example.projectii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Base {

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "fullName")
    private String fullName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getFullName() {
        return fullName;
    }
}
