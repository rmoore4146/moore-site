package org.moore.dev.web.controller;

import org.moore.dev.web.controller.util.MobileDeviceUtil;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: ryan
 * Date: 1/25/14
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

//    Logger logger = Logger.getLogger(WeddingController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getNakedURLRedirectPage(ModelMap map, HttpServletRequest request) {
        return "forward:home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage(ModelMap map, HttpServletRequest request) {
        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String getAboutPage(ModelMap map, HttpServletRequest request) {
        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContactPage(ModelMap map, HttpServletRequest request) {
        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        return "contact";
    }
}
