package com.dao;

import com.pojo.Account;

import java.util.List;

public interface IAccountDao {
    public void insert(Account account);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long accId);
    public Account find(long accId);
    public List<Account> find(List<Long> accIds);
    public List<Account> find(boolean locked);
}
