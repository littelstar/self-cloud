package com.lpp.gateway.auth;

import com.alibaba.fastjson.JSON;
import com.lpp.gateway.constance.ReturnCode;
import com.lpp.gateway.vo.JsonResponseBase;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZD
 */
@Component
public class AjaxLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        JsonResponseBase responseBody = new JsonResponseBase(ReturnCode.SUCCESS);
        //TODO 退出成功后，需求清理token之类
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
    }
}
