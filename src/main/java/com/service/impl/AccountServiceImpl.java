package com.service.impl;

import com.dao.impl.AccountDaoImpl;
import com.pojo.Account;
import com.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    private AccountDaoImpl accountDao;

    public AccountServiceImpl() {
        //accountDao = new AccountDaoImpl();
    }
    public String transferMoney(Long sourceAccId, Long targetAccId, double amount) {
        String msg = "转账成功";
        Account sourceAccount = accountDao.find(sourceAccId);
        Account targetAccount = accountDao.find(targetAccId);
        if(sourceAccount.getAccBalance() < amount) {
            msg = "余额不足";
        }else {
            sourceAccount.setAccBalance(sourceAccount.getAccBalance() - amount);
            targetAccount.setAccBalance(targetAccount.getAccBalance() + amount);
            accountDao.update(sourceAccount);
            accountDao.update(targetAccount);
        }
        return msg;
    }

    public void depositMoney(Long accId, double amount) {
        Account account = accountDao.find(accId);
        account.setAccBalance(account.getAccBalance() + amount);
        accountDao.update(account);
    }

    public Account getAccount(long accId) {

        return accountDao.find(accId);
    }

    public AccountDaoImpl getAccountDao() {
        return accountDao;
    }

    @Autowired
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
}
