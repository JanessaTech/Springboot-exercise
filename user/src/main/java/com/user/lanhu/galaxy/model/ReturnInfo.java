package com.user.lanhu.galaxy.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnInfo {
    private String userId;
    private String token;
    private Boolean perfectPersonalData;
    private Boolean phoneNumberBinding;
    private ReturnInfo(){}
    private ReturnInfo(String userId, String token, Boolean perfectPersonalData, Boolean phoneNumberBinding){
        this.userId = userId;
        this.token = token;
        this.perfectPersonalData = perfectPersonalData;
        this.phoneNumberBinding = phoneNumberBinding;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public Boolean getPerfectPersonalData() {
        return perfectPersonalData;
    }

    public Boolean getPhoneNumberBinding() {
        return phoneNumberBinding;
    }

    public static class ReturnInfoBuilder{
        private String userId;
        private String token;
        private Boolean perfectPersonalData;
        private Boolean phoneNumberBinding;

        public ReturnInfoBuilder setUserId(String userId){
            this.userId = userId;
            return this;
        }

        public ReturnInfoBuilder setToken(String token){
            this.token = token;
            return this;
        }

        public ReturnInfoBuilder setPerfectPersonalData(Boolean perfectPersonalData){
            this.perfectPersonalData = perfectPersonalData;
            return this;
        }

        public ReturnInfoBuilder setPhoneNumberBinding(Boolean phoneNumberBinding){
            this.phoneNumberBinding = phoneNumberBinding;
            return this;
        }

        public ReturnInfo build(){
            return new ReturnInfo(this.userId, this.token, this.perfectPersonalData, this.phoneNumberBinding);
        }
    }
}
