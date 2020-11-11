package com.user.lanhu.galaxy.controller;

import com.user.lanhu.galaxy.exception.definitions.SampleException;
import com.user.lanhu.galaxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tuoke-web/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registerOrLogin", method = RequestMethod.POST)
    public ResponseEntity<Object> registerOrLogin(
            @RequestParam(value = "phone", required = true, defaultValue = "") String phone,
            @RequestParam(value = "verificationCode", required = true, defaultValue = "") String verificationCode
    ) {
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/qqOrWechatLogin", method = RequestMethod.POST)
    public ResponseEntity<Object> qqOrWechatLogin(
            @RequestParam(value = "thirdKey", required = true, defaultValue = "") String thirdKey,
            @RequestParam(value = "thirdType", required = true, defaultValue = "") String thirdType
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/verificationPwd", method  = RequestMethod.POST)
    public ResponseEntity<Object> verificationPwd(
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId,
            @RequestParam(value = "oldPwd", required = true, defaultValue = "") String oldPwd
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/loginOut", method = RequestMethod.POST)
    public ResponseEntity<Object> loginOut(
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public ResponseEntity<Object> getUser(
            @RequestParam(value = "loginUserId", required = true, defaultValue = "") String loginUserId,
            @RequestParam(value = "otherUserId", required = false, defaultValue = "") String otherUserId
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/bindingPhone", method = RequestMethod.POST)
    public ResponseEntity<Object> bindingPhone(
            @RequestParam(value = "phone", required = true, defaultValue = "") String phone,
            @RequestParam(value = "verificationCode", required = true, defaultValue = "") String verificationCode
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/sendSmsCode", method = RequestMethod.POST)
    public ResponseEntity<Object> sendSmsCode(
            @RequestParam(value = "phone", required = true, defaultValue = "") String phone,
            @RequestParam(value = "areaCode", required = true, defaultValue = "") String areaCode
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/perfectPersonalData", method = RequestMethod.POST)
    public ResponseEntity<Object> perfectPersonalData(
            @RequestParam(value = "id", required = true, defaultValue = "") String id,
            @RequestParam(value = "userName", required = true, defaultValue = "") String userName,
            @RequestParam(value = "userPassword", required = true, defaultValue = "") String userPassword,
            @RequestParam(value = "imgFile", required = true, defaultValue = "") String imgFile

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    public ResponseEntity<Object> resetPassword(
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId,
            @RequestParam(value = "newPwd", required = true, defaultValue = "") String newPwd,
            @RequestParam(value = "newPwdTwo", required = true, defaultValue = "") String newPwdTwo

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/retrievePassword", method = RequestMethod.POST)
    public ResponseEntity<Object> retrievePassword(
            @RequestParam(value = "phone", required = true, defaultValue = "") String phone,
            @RequestParam(value = "verificationCode", required = true, defaultValue = "") String verificationCode

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public ResponseEntity<Object> doLogin(
            @RequestParam(value = "userName", required = true, defaultValue = "") String userName,
            @RequestParam(value = "userPassword", required = true, defaultValue = "") String userPassword

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/getFocusonUser", method = RequestMethod.POST)
    public ResponseEntity<Object> getFocusOnUser(
            @RequestParam(value = "page", required = true, defaultValue = "") String page,
            @RequestParam(value = "loginUserId", required = true, defaultValue = "") String loginUserId,
            @RequestParam(value = "otherUserId", required = false, defaultValue = "") String otherUserId

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/getFansUser", method = RequestMethod.POST)
    public ResponseEntity<Object> getFansUser(
            @RequestParam(value = "page", required = true, defaultValue = "") String page,
            @RequestParam(value = "loginUserId", required = true, defaultValue = "") String loginUserId,
            @RequestParam(value = "otherUserId", required = false, defaultValue = "") String otherUserId

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/getGlobalSearchUser", method = RequestMethod.POST)
    public ResponseEntity<Object> getGlobalSearchUser(
            @RequestParam(value = "page", required = true, defaultValue = "") String page,
            @RequestParam(value = "keyword", required = true, defaultValue = "") String keyword,
            @RequestParam(value = "userId", required = false, defaultValue = "") String userId

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/changeUserInfo", method = RequestMethod.POST)
    public ResponseEntity<Object> changeUserInfo(
            @RequestParam(value = "id", required = true, defaultValue = "") String id,
            @RequestParam(value = "userName", required = false, defaultValue = "") String userName,
            @RequestParam(value = "userSex", required = false, defaultValue = "") String userSex,
            @RequestParam(value = "userAge", required = false, defaultValue = "") String userAge,
            @RequestParam(value = "userSign", required = false, defaultValue = "") String userSign

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/changeTheAvatar", method = RequestMethod.POST)
    public ResponseEntity<Object> changeTheAvatar(
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId,
            @RequestParam(value = "userImg", required = true, defaultValue = "") String userImg

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/changingBindingPhone", method = RequestMethod.POST)
    public ResponseEntity<Object> changingBindingPhone(
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId,
            @RequestParam(value = "phone", required = true, defaultValue = "") String phone,
            @RequestParam(value = "verificationCode", required = true, defaultValue = "") String verificationCode

    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/getUserByName", method = RequestMethod.POST)
    public ResponseEntity<Object> getUserByName(
            @RequestParam(value = "userName", required = true, defaultValue = "") String userName,
            @RequestParam(value = "userId", required = false, defaultValue = "") String userId
    ){
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
