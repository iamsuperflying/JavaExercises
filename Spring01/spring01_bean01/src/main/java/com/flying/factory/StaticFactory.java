package com.flying.factory;

import com.flying.service.IAccountService;
import com.flying.service.impl.AccountServiceImpl;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class StaticFactory {
    public static IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
