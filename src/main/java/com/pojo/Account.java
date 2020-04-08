package com.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Account {
    private Long accId;
    private String accOwnerName;
    private double accBalance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date accAccessTime;
    private Boolean accLocked;

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getAccOwnerName() {
        return accOwnerName;
    }

    public void setAccOwnerName(String accOwnerName) {
        this.accOwnerName = accOwnerName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public Date getAccAccessTime() {
        return accAccessTime;
    }

    public void setAccAccessTime(Date accAccessTime) {
        this.accAccessTime = accAccessTime;
    }

    public Boolean getAccLocked() {
        return accLocked;
    }

    public void setAccLocked(Boolean accLocked) {
        this.accLocked = accLocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", accOwnerName='" + accOwnerName + '\'' +
                ", accBalance=" + accBalance +
                ", accAccessTime=" + accAccessTime +
                ", accLocked=" + accLocked +
                '}';
    }
}
