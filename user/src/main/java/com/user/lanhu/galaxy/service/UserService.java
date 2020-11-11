package com.user.lanhu.galaxy.service;

import com.user.lanhu.galaxy.exception.definitions.LoginFailureException;
import com.user.lanhu.galaxy.exception.definitions.RegisterFailureException;
import com.user.lanhu.galaxy.exception.definitions.VerificationFailureException;

import com.user.lanhu.galaxy.model.ReturnInfo;
import com.user.lanhu.galaxy.model.UserInfo;

import java.util.List;

public interface UserService {
    ReturnInfo registerOrLogin(String phone, String verificationCode)
            throws LoginFailureException, RegisterFailureException;
    ReturnInfo qqOrWechatLogin(String thirdKey, String thirdType) throws LoginFailureException;
    void verificationPwd(String userId, String oldPwd) throws VerificationFailureException;
    void loginOut(String userId);
    UserInfo getUser(String loginUserId, String otherUserId) throws Exception;
    ReturnInfo bindingPhone(String phone, String verificationCode) throws Exception;
    void sendSmsCode(String phone, String areaCode) throws Exception;
    void perfectPersonalData(String id, String userName, String userPassword, String imgFile) throws Exception;
    void resetPassword(String userId, String newPwd, String  newPwdTwo) throws Exception;
    void retrievePassword(String phone, String verificationCode) throws Exception;
    ReturnInfo doLogin(String userName, String userPassword) throws Exception;
    List<UserInfo> getFocusOnUser(String page, String loginUserId, String otherUserId) throws Exception;
    List<UserInfo> getFansUser(String page, String loginUserId, String otherUserId) throws Exception;
    UserInfo getGlobalSearchUser(String page, String keyword, String userId) throws Exception;
    void changeUserInfo(String id, String userName, String userSex, String userAge, String userSign) throws Exception;
    void changeTheAvatar(String userId, String userImg) throws Exception;
    void changingBindingPhone(String userId, String phone, String verificationCode) throws Exception;
    UserInfo getUserByName(String userName, String userId) throws Exception;


}
