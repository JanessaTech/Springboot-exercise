package com.user.lanhu.galaxy.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo {
    private String id;
    private String userName;
    private String userImg;
    private String userSex;
    private Integer userAge;
    private String userPhone;
    private String userArea;
    private String userPassword;
    private String userSign;
    private String remarks;
    private Integer focusCount;
    private Integer fansCount;
    private String userLabel;
    private Boolean isFocusOn;
    private Boolean isBlacklist;

    private UserInfo(){}
    private UserInfo(String id,
                     String userName,
                     String userImg,
                     String userSex,
                     Integer userAge,
                     String userPhone,
                     String userArea,
                     String userPassword,
                     String userSign,
                     String remarks,
                     Integer focusCount,
                     Integer fansCount,
                     String userLabel,
                     Boolean isFocusOn,
                     Boolean isBlacklist){
        this.id = id;
        this.userName = userName;
        this.userImg = userImg;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userPhone = userPhone;
        this.userArea = userArea;
        this.userPassword = userPassword;
        this.userSign = userSign;
        this.remarks = remarks;
        this.focusCount = focusCount;
        this.fansCount = fansCount;
        this.userLabel = userLabel;
        this.isFocusOn = isFocusOn;
        this.isBlacklist = isBlacklist;
    }

    public String getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public String getUserSex() {
        return userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserArea() {
        return userArea;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserSign() {
        return userSign;
    }

    public String getRemarks() {
        return remarks;
    }

    public Integer getFocusCount() {
        return focusCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public String getUserLabel() {
        return userLabel;
    }

    public Boolean isFocusOn() {
        return isFocusOn;
    }

    public Boolean isBlacklist() {
        return isBlacklist;
    }

    public static class UserInfoBuilder {
        private String id;
        private String userName;
        private String userImg;
        private String userSex;
        private Integer userAge;
        private String userPhone;
        private String userArea;
        private String userPassword;
        private String userSign;
        private String remarks;
        private Integer focusCount;
        private Integer fansCount;
        private String userLabel;
        private Boolean isFocusOn;
        private Boolean isBlacklist;

        public UserInfoBuilder setId(String id){
            this.id = id;
            return this;
        }

        public UserInfoBuilder setUserName(String userName){
            this.userName = userName;
            return this;
        }

        public UserInfoBuilder setUserImg(String userImg){
            this.userImg = userImg;
            return this;
        }

        public UserInfoBuilder setUserSex(String userSex){
            this.userSex = userSex;
            return this;
        }

        public UserInfoBuilder setUserAge(Integer userAge){
            this.userAge = userAge;
            return this;
        }

        public UserInfoBuilder setUserPhone(String userPhone){
            this.userPhone = userPhone;
            return this;
        }

        public UserInfoBuilder setUserArea(String userArea){
            this.userArea = userArea;
            return this;
        }

        public UserInfoBuilder setUserPassword(String userPassword){
            this.userPassword = userPassword;
            return this;
        }

        public UserInfoBuilder setUserSign(String userSign){
            this.userSign = userSign;
            return this;
        }

        public UserInfoBuilder setRemarks(String remarks){
            this.remarks = remarks;
            return this;
        }

        public UserInfoBuilder setFocusCount(Integer focusCount){
            this.focusCount = focusCount;
            return this;
        }

        public UserInfoBuilder setFansCount(Integer fansCount){
            this.fansCount = fansCount;
            return this;
        }

        public UserInfoBuilder setUserLabel(String userLabel){
            this.userLabel = userLabel;
            return this;
        }

        public UserInfoBuilder setIsFocusOn(Boolean isFocusOn){
            this.isFocusOn = isFocusOn;
            return this;
        }

        public UserInfoBuilder setIsBlacklist(Boolean isBlacklist){
            this.isBlacklist = isBlacklist;
            return this;
        }

        public UserInfo build(){
            return new UserInfo(this.id, this.userName, this.userImg, this.userSex, this.userAge, this.userPhone, this.userArea, this.userPassword, this.userSign, this.remarks, this.focusCount, this.fansCount, this.userLabel, this.isFocusOn, this.isBlacklist);
        }
    }
}
