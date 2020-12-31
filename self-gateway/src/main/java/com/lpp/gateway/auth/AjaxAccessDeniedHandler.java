package com.lpp.gateway.auth;

import com.alibaba.fastjson.JSON;
import com.lpp.gateway.constance.ReturnCode;
import com.lpp.gateway.vo.JsonResponseBase;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 无权访问
 *
 * @author ZD
 */
@Component
public class AjaxAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        JsonResponseBase responseBase = new JsonResponseBase(ReturnCode.NO_AUTH);
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBase));
    }
}
