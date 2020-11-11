package com.user.lanhu.galaxy.controller;

import com.user.lanhu.galaxy.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tuoke-web/api/focuson")
public class FocusOnController {
    @Autowired
    private FocusService focusService;

    @RequestMapping(value = "/getFocusReleaseInfo", method = RequestMethod.POST)
    public ResponseEntity<Object> getFocusReleaseInfo(
            @RequestParam(value = "page", required = true, defaultValue = "-1") String page,
            @RequestParam(value = "userId", required = true, defaultValue = "") String userId
    ) {
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/addFocuson", method = RequestMethod.POST)
    public ResponseEntity<Object> addFocusOn(
            @RequestParam(value = "focusUid", required = true, defaultValue = "-1") String focusUid,
            @RequestParam(value = "fansUid", required = true, defaultValue = "") String fansUid
    ) {
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping(value = "/cancelFocuson", method = RequestMethod.POST)
    public ResponseEntity<Object> cancelFocuson(
            @RequestParam(value = "focusUid", required = true, defaultValue = "-1") String focusUid,
            @RequestParam(value = "fansUid", required = true, defaultValue = "") String fansUid
    ) {
        //to-do
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

}
