package com.lpp.gateway.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

/**
 * @author lpp
 * @date 2020/12/30
 */
@Component
public class SelfAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        WebAuthenticationDetails wauth = (WebAuthenticationDetails) authentication.getDetails();
        // 这个获取表单输入中返回的用户名;
        String userName = (String) authentication.getPrincipal();
        String password = "1234";
        return new UsernamePasswordAuthenticationToken(userName, password, null);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
