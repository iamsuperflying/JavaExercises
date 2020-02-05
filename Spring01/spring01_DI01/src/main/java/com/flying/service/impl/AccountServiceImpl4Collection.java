package com.flying.service.impl;

import com.flying.service.IAccountService;

import java.util.*;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class AccountServiceImpl4Collection implements IAccountService {

    /** 以下用来测试 DI */
    private String[]     myStrings;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProps;

    public void setMyStrings(String[] myStrings) {
        this.myStrings = myStrings;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    /** 以上用来测试 DI */

    public void saveAccount() {
        System.out.println("保存账户...\n" + Arrays.toString(myStrings) + "\n" + myList + "\n" + mySet + "\n" + myMap + "\n" + myProps);
    }
}
