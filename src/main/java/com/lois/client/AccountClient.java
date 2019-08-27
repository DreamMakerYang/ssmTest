package com.lois.client;

import com.lois.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountClient {
    @Test
    public void findAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        accountDao.findAll();
    }
}
