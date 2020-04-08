package com.factory;

import com.dao.IAccountDao;
import com.dao.impl.AccountDaoImpl;
import com.service.IAccountService;
import com.service.impl.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountFactory {
    @Bean
    public IAccountService getAccountServiceImpl() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao((AccountDaoImpl) getAccountDaoImpl());
        return bean;
    }

    @Bean
    public IAccountDao getAccountDaoImpl() {
        AccountDaoImpl bean = new AccountDaoImpl();
        return bean;
    }
}
