package com.lpp.gateway.auth;

import com.alibaba.fastjson.JSON;
import com.lpp.gateway.constance.ReturnCode;
import com.lpp.gateway.vo.JsonResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户登录失败时返回给前端的数据
 *
 * @author ZD
 */
@Component
public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        JsonResponse responseBody = new JsonResponse(ReturnCode.OUT_OF_IP);
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
    }
}
