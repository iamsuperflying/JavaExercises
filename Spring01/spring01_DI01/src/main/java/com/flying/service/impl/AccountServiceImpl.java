package com.flying.service.impl;

import com.flying.service.IAccountService;

import java.util.Date;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class AccountServiceImpl implements IAccountService {

    /** 以下用来测试 DI */
    private String  name;
    private Integer age;
    private Date    birthday;
    /** 以上用来测试 DI */

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        System.out.println("初始化...");
        this.name     = name;
        this.age      = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("保存账户..." + name + "," + age + "," + birthday);
    }
}
