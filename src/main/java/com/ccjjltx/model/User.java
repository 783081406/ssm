package com.ccjjltx.model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer utype;

    public User(Integer id, String username, String password, Integer utype) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.utype = utype;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }
}