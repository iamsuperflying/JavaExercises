package com.flying.service.impl;

import com.flying.service.IAccountService;

import java.util.Date;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class AccountServiceImpl4Setter implements IAccountService {

    /** 以下用来测试 DI */
    private String  name;
    private Integer age;
    private Date    birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /** 以上用来测试 DI */

    public void saveAccount() {
        System.out.println("保存账户..." + name + "," + age + "," + birthday);
    }
}
