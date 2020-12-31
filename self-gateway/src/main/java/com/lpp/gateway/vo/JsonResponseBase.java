package com.lpp.gateway.vo;

import com.lpp.gateway.constance.ReturnCode;

/**
 * @author lpp
 * @date 2020/12/30
 */
public class JsonResponseBase {


    /**
     * 系统码
     */
    protected Integer status;
    /**
     * 错误信息
    protected String error;
    /**
     * 流水号
     */
    protected String serialNo;
    /**
     * 时间戳
     */
    protected Long timestamp;

    protected String error;

    public JsonResponseBase() {
    }

    /**
     * 前端返回专用
     * @param returnCode 返回结果
     */
    public JsonResponseBase(ReturnCode returnCode){
        this.status = returnCode.getStatus();
        this.error = returnCode.getError();
    }
    public JsonResponseBase(ReturnCode returnCode,String error){
        this.status = returnCode.getStatus();
        this.error = error;
    }

    public JsonResponseBase(String serialNo, ReturnCode returnCode) {
        this.serialNo = serialNo;
        this.status = returnCode.getStatus();
        this.error = returnCode.getError();
        this.timestamp = System.currentTimeMillis();
    }

    public JsonResponseBase(String serialNo) {
        this.serialNo = serialNo;
    }
}
