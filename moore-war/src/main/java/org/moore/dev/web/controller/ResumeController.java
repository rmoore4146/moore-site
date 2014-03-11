package org.moore.dev.web.controller;

import org.moore.dev.web.controller.util.MobileDeviceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/10/14
 */
@Controller
public class ResumeController {

    @RequestMapping(value = "/resume", method = RequestMethod.GET)
    public String getResumePage(ModelMap map, HttpServletRequest request) {
        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        return "resume";
    }
}
