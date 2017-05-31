package com.gaussic.util;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Ret {
    private String code;
    private String errorMessage="";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
