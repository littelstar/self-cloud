package com.lpp.gateway.auth;

import com.alibaba.fastjson.JSON;
import com.lpp.gateway.constance.ReturnCode;
import com.lpp.gateway.vo.JsonResponse;
import com.lpp.gateway.vo.JsonResponseBase;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户没有登录时返回给前端的数据
 */
@Component
public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {
	@Override
	public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
		JsonResponseBase responseBody = new JsonResponseBase(ReturnCode.WEB_NOT_LOGIN);
		httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	}
}
