package com.flying.service.impl;

import com.flying.service.IAccountService;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl() {
        System.out.println("初始化...");
    }

    public void saveAccount() {
        System.out.println("保存账户...");
    }
}
