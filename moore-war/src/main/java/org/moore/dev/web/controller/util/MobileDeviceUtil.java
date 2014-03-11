package org.moore.dev.web.controller.util;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/9/14
 */
public class MobileDeviceUtil {

    public static void addMobileDeviceFlagToModel(ModelMap map, HttpServletRequest request) {
        Device currentDevice = DeviceUtils.getCurrentDevice(request);
        map.addAttribute("isMobile", currentDevice.isMobile());
    }
}
