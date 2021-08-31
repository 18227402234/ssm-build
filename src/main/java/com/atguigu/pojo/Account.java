package com.atguigu.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zxx
 * @create 2021-08-31 14:23
 */
@Component
public class Account implements Serializable {

    private static final long serialVersionUID = 68497944734210L;
    private Integer id;
    private String name;
    private Double money;

    public Account() {
    }

    public Account(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
