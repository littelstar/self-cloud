package com.lpp.gateway.service;

import com.lpp.gateway.entity.SecurityUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lpp
 * @date 2020/12/30
 */
@Primary
@Component
public class SecurityUserService implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(SecurityUserService.class);
    // @Resource
    // UserMapper userMapper;

    /**
     * 用户认证、查询权限
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public SecurityUser loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.debug("loadUserByUsername:" + username);
        User user = null;
        if (username != null && !"".equals(username)) {
            user = userMapper.selectOne(new QueryWrapper<User>().eq("username", username));
        }
        SecurityUser securityUser = null;
        if (user != null) {
            securityUser = new SecurityUser(user);
        }
        return securityUser;
    }
}

