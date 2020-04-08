package com.service;

import com.pojo.Account;

public interface IAccountService {
    /**
     * 转账
     * @param sourceAccId   源账号
     * @param targetAccId   目标账号
     * @param amount        资金数
     */
    public String transferMoney(Long sourceAccId, Long targetAccId, double amount);


    /**
     * 存钱
     * @param accId     要存入的账号
     * @param amount    资金数
     */
    public void depositMoney(Long accId, double amount);

    /**
     * 依据账号id获出账号对象
     * @param accId 账号id
     * @return  账号对象
     */
    public Account getAccount(long accId);
}
