package org.moore.dev.web.controller.util;

import java.io.Serializable;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/10/14
 */
public class AjaxResponse implements Serializable {

    private boolean success;

    public AjaxResponse(boolean success) {
        this.setSuccess(success);
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
