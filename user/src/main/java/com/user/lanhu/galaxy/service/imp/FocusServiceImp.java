package com.user.lanhu.galaxy.service.imp;

import com.user.lanhu.galaxy.dao.UserMapper;
import com.user.lanhu.galaxy.model.UserPublishedObj;
import com.user.lanhu.galaxy.service.FocusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FocusServiceImp implements FocusService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserPublishedObj getFocusReleaseInfo(int page, String userId) throws Exception {
        return null;
    }

    @Override
    public void addFocusOn(String focusUid, String fansUid) throws Exception {

    }

    @Override
    public void cancelFocusOn(String focusUid, String fansUid) throws Exception {

    }
}
