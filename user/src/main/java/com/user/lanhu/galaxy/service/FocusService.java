package com.user.lanhu.galaxy.service;

import com.user.lanhu.galaxy.model.UserPublishedObj;

public interface FocusService {
    UserPublishedObj getFocusReleaseInfo(int page, String userId) throws Exception;
    void addFocusOn(String focusUid, String fansUid) throws Exception;
    void cancelFocusOn(String focusUid, String fansUid) throws Exception;
}
