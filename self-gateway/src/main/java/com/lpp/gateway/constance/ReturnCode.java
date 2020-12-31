package com.lpp.gateway.constance;

/**
 * @author lpp
 * @date 2020/12/30
 */
public enum ReturnCode {
    SUCCESS(0, "成功"),
    //api账号不存在、账号过期、账号未生效、账号未分配权限
    NO_AUTH(0001, "无权访问"),
    OUT_OF_IP(0002, "IP访问限制"),
    SYSTEM_ERROR(9999, "系统异常"),
    WEB_NOT_LOGIN(1111,"未登录");




    int status;
    String error;

    ReturnCode() {
    }

    ReturnCode(int status, String error) {
        this.status = status;
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }
}
