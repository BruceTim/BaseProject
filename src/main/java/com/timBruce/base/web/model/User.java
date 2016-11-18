package com.timBruce.base.web.model;

import com.alibaba.fastjson.JSON;
import com.timBruce.base.web.enums.UserState;

import java.util.Date;
import java.util.Set;

public class User {
    private Long id;

    private String username;

    private String sex;

    private String email;

    private String phone;

    private UserState state;

    private String salt;

    private String password;

    private Date createTime;

    private String picture;

    private Set<Role> roles;

    public User () {
    }

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Set<Role> getRoles () {
        return roles;
    }

    public void setRoles (Set<Role> roles) {
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public UserState getState () {
        return state;
    }

    public void setState (UserState state) {
        this.state = state;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    @Override
    public int hashCode () {
        return id.hashCode();
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        if (this.hashCode() == obj.hashCode()) return true;
        if (this.username.equals(((User) obj).getUsername())) return true;
        return false;
    }

    @Override
    public String toString () {
        return JSON.toJSONString(this);
    }
}