package com.eddy.liveline.user.pojo;

import java.io.Serializable;

public class Account implements Serializable {

  private String id;
  //名字
  private String name;
  //性别
  private Integer sex;
  //邮箱
  private String email;
  //密码
  private String password;
  //手机
  private String mobile;
  //状态
  private Integer state;
  //出生日期
  private long birthday;
  //注册时间
  private long registerTime;
  //最近登录
  private long lastLoginTime;
  //最近登录的ip
  private String lastLoginIp;


  /** default constructor */
  public Account() {}

  
  public String getLastLoginIp() {
    return lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }

  public long getBirthday() {
    return birthday;
  }


  public void setBirthday(long birthday) {
    this.birthday = birthday;
  }


  public long getRegisterTime() {
    return registerTime;
  }


  public void setRegisterTime(long registerTime) {
    this.registerTime = registerTime;
  }


  public long getLastLoginTime() {
    return lastLoginTime;
  }


  public void setLastLoginTime(long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSex() {
    return this.sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Integer getState() {
    return this.state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Account [id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email
        + ", password=" + password + ", mobile=" + mobile + ", state=" + state + ", birthday="
        + birthday + ", registerTime=" + registerTime + ", lastLoginTime=" + lastLoginTime
        + ", lastLoginIp=" + lastLoginIp + "]";
  }
  
}
