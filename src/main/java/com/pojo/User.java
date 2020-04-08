package com.pojo;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

public class User {
    private Integer userId;
    // 验证用户名长度,在3-20位之间
    @Size(min=3, max=20, message = "{error.userName}")
    private String userName;
    private String userLastName;
    // 密码样式注解
    @Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message = "{error.userPwd}")
    private String userPwd;
    // Email验证注解
    @Email(message = "{error.userEmail}")
    private String userEmail;
    // 信用卡验证注解
    @CreditCardNumber(message = "{error.userCredit}")
    private String userCredit;
    private String userDetail;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate userBirthDay;
    private String userCountry;
    private Boolean userSmoking;
    private String userGender;
    private MultipartFile file;

    public User() {}

    public User(String userName, String userLastName) {
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(String userDetail) {
        this.userDetail = userDetail;
    }

    public LocalDate getUserBirthDay() {
        return userBirthDay;
    }

    public void setUserBirthDay(LocalDate userBirthDay) {
        this.userBirthDay = userBirthDay;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public Boolean getUserSmoking() {
        return userSmoking;
    }

    public void setUserSmoking(Boolean userSmoking) {
        this.userSmoking = userSmoking;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCredit() {
        return userCredit;
    }

    public void setUserCredit(String userCredit) {
        this.userCredit = userCredit;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userCredit='" + userCredit + '\'' +
                ", userDetail='" + userDetail + '\'' +
                ", userBirthDay=" + userBirthDay +
                ", userCountry='" + userCountry + '\'' +
                ", userSmoking=" + userSmoking +
                ", userGender='" + userGender + '\'' +
                '}';
    }
}
