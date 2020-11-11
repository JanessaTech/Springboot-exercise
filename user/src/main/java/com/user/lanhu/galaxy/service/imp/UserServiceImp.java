package com.user.lanhu.galaxy.service.imp;

import com.user.lanhu.galaxy.dao.UserMapper;
import com.user.lanhu.galaxy.exception.definitions.LoginFailureException;
import com.user.lanhu.galaxy.exception.definitions.RegisterFailureException;
import com.user.lanhu.galaxy.exception.definitions.VerificationFailureException;
import com.user.lanhu.galaxy.model.ReturnInfo;
import com.user.lanhu.galaxy.model.UserInfo;
import com.user.lanhu.galaxy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ReturnInfo registerOrLogin(String phone, String verificationCode) throws LoginFailureException, RegisterFailureException {
        return null;
    }

    @Override
    public ReturnInfo qqOrWechatLogin(String thirdKey, String thirdType) throws LoginFailureException {
        return null;
    }

    @Override
    public void verificationPwd(String userId, String oldPwd) throws VerificationFailureException {

    }

    @Override
    public void loginOut(String userId) {

    }

    @Override
    public UserInfo getUser(String loginUserId, String otherUserId) throws Exception {
        return null;
    }

    @Override
    public ReturnInfo bindingPhone(String phone, String verificationCode) throws Exception {
        return null;
    }

    @Override
    public void sendSmsCode(String phone, String areaCode) throws Exception {

    }

    @Override
    public void perfectPersonalData(String id, String userName, String userPassword, String imgFile) throws Exception {

    }

    @Override
    public void resetPassword(String userId, String newPwd, String newPwdTwo) throws Exception {

    }

    @Override
    public void retrievePassword(String phone, String verificationCode) throws Exception {

    }

    @Override
    public ReturnInfo doLogin(String userName, String userPassword) throws Exception {
        return null;
    }

    @Override
    public List<UserInfo> getFocusOnUser(String page, String loginUserId, String otherUserId) throws Exception {
        return null;
    }

    @Override
    public List<UserInfo> getFansUser(String page, String loginUserId, String otherUserId) throws Exception {
        return null;
    }

    @Override
    public UserInfo getGlobalSearchUser(String page, String keyword, String userId) throws Exception {
        return null;
    }

    @Override
    public void changeUserInfo(String id, String userName, String userSex, String userAge, String userSign) throws Exception {

    }

    @Override
    public void changeTheAvatar(String userId, String userImg) throws Exception {

    }

    @Override
    public void changingBindingPhone(String userId, String phone, String verificationCode) throws Exception {

    }

    @Override
    public UserInfo getUserByName(String userName, String userId) throws Exception {
        return null;
    }
}
