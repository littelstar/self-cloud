package com.lpp.gateway.vo;

import com.lpp.gateway.constance.ReturnCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lpp
 * @date 2020/12/30
 */
@Data
public class JsonResponse<T> extends JsonResponseBase implements Serializable {

    private static final long serialVersionUID = 4170906243127580509L;
    /**
     * 业务结果
     */
    private T info;

    public JsonResponse() {
        super();
    }
    public JsonResponse(T info) {
        this.status = ReturnCode.SUCCESS.getStatus();
        this.error = ReturnCode.SUCCESS.getError();
        this.info = info;
    }

    public JsonResponse(String serialNo, ReturnCode returnCode) {
        super(serialNo, returnCode);
    }

    public JsonResponse(String serialNo, ReturnCode returnCode, T info) {
        super(serialNo, returnCode);
        this.info = info;
    }

    public JsonResponse(String serialNo) {
        super(serialNo);
    }

    public void putSuccess(T info) {
        this.status = ReturnCode.SUCCESS.getStatus();
        this.error = ReturnCode.SUCCESS.getError();
        this.info = info;
    }

    public JsonResponse(ReturnCode returnCode) {
        this.error = returnCode.getError();
        this.status = returnCode.getStatus();

    }

    public void putFail(ReturnCode returnCode) {
        this.status = returnCode.getStatus();
        this.error = returnCode.getError();
    }

}

