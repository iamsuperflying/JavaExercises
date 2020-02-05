package com.flying.ui;

import com.flying.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LPF.
 * Created 2020/2/4
 */
public class Client {

    public static void main(String[] args) {
        /// 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        /// 根据 id 获取 bean 对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        System.out.println(as);

        IAccountService as2 = (IAccountService)ac.getBean("accountService4Setter");
        System.out.println(as2);

        IAccountService as3 = (IAccountService)ac.getBean("accountService4Collection");
        System.out.println(as3);

        as.saveAccount();
        as2.saveAccount();
        as3.saveAccount();
    }

}
