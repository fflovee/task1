package com.jnshu.hpmybatis.pojo;

import org.springframework.stereotype.Component;

/*
pojo实体类
POJO实质上可以理解为简单的实体类，顾名思义POJO类的作用是方便程序员使用数据库中的数据表，
对于广大的程序员，可以很方便的将POJO类当做对象来进行使用，当然也是可以方便的调用其get,set方法。
POJO类也给我们在struts框架中的配置带来了很大的方便。
*/
//@Component：定义Spring管理Bean
@Component
public class User {
    private Integer id,jointime,jnshuID,create_at,update_at;
    private long qq;
    private String name,type,technology,daily,wish,brother,knowfrom;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", jointime=" + jointime +
                ", jnshuID=" + jnshuID +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", qq=" + qq +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", technology='" + technology + '\'' +
                ", daily='" + daily + '\'' +
                ", wish='" + wish + '\'' +
                ", brother='" + brother + '\'' +
                ", knowfrom='" + knowfrom + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJointime(Integer jointime) {
        this.jointime = jointime;
    }

    public void setJnshuID(Integer jnshuID) {
        this.jnshuID = jnshuID;
    }

    public void setCreate_at(Integer create_at) {
        this.create_at = create_at;
    }

    public void setUpdate_at(Integer update_at) {
        this.update_at = update_at;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public void setKnowfrom(String knowfrom) {
        this.knowfrom = knowfrom;
    }

    public Integer getId() {
        return id;
    }

    public Integer getJointime() {
        return jointime;
    }

    public Integer getJnshuID() {
        return jnshuID;
    }

    public Integer getCreate_at() {
        return create_at;
    }

    public Integer getUpdate_at() {
        return update_at;
    }

    public long getQq() {
        return qq;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTechnology() {
        return technology;
    }

    public String getDaily() {
        return daily;
    }

    public String getWish(String s) {
        return wish;
    }

    public String getBrother() {
        return brother;
    }

    public String getKnowfrom() {
        return knowfrom;
    }
}
