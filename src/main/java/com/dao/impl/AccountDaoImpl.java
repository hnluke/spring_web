package com.dao.impl;

import com.dao.IAccountDao;
import com.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AccountDaoImpl implements IAccountDao {

    private Map<Long, Account> accountsMap = new HashMap<Long, Account>();

    {
        Account account1 = new Account();
        account1.setAccId(1L);
        account1.setAccOwnerName("Luke");
        account1.setAccBalance(100.0D);
        Account account2 = new Account();
        account2.setAccId(2L);
        account2.setAccOwnerName("Rain");
        account2.setAccBalance(150.0D);

        accountsMap.put(account1.getAccId(), account1);
        accountsMap.put(account2.getAccId(), account2);
    }
    public void insert(Account account) {
        accountsMap.put(account.getAccId(), account);
    }

    public void update(Account account) {
        accountsMap.get(account.getAccId()).setAccBalance(account.getAccBalance());
    }

    public void update(List<Account> accounts) {
        for(Account account : accounts) {
            update(account);
        }
    }

    public void delete(long accId) {
        accountsMap.remove(accId);
    }

    public Account find(long accId) {
        Account account = null;
        account = accountsMap.get(accId);
        return account;
    }

    public List<Account> find(List<Long> accIds) {
        List<Account> accounts = new ArrayList<Account>();
        for(long accId : accIds) {
            accounts.add(find(accId));
        }
        return accounts;
    }

    public List<Account> find(boolean locked) {
        List<Account> accounts = new ArrayList<Account>();
        for(Map.Entry<Long, Account> entry: accountsMap.entrySet()) {
            accounts.add(entry.getValue());
        }
        return accounts;
    }
}
