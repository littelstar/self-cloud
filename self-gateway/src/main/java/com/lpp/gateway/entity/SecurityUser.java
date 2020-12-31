package com.lpp.gateway.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lpp
 * @date 2020/12/30
 */
public class SecurityUser extends User implements UserDetails {
    private Collection<GrantedAuthority> roles;
    private User user;

    public SecurityUser() {
        super();
    }


    public SecurityUser(User user) {
        if (user != null) {
            this.setId(user.getId());
            this.setUsername(user.getUsername());
            this.setPassword(user.getPassword());
            this.setDeleted(user.getDeleted());
            this.setUser(user);
            this.setIpWhiteList(user.getIpWhiteList());
        }


    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    //账户是否未过期,过期无法验证
    @Override
    public boolean isAccountNonExpired() {
        return this.deleted == EntityConstance.Common.DELETED_NO;
    }

    //指定用户是否解锁,锁定的用户无法进行身份验证
    @Override
    public boolean isAccountNonLocked() {
        return this.deleted == EntityConstance.Common.DELETED_NO;
    }

    //指示是否已过期的用户的凭据(密码),过期的凭据防止认证
    @Override
    public boolean isCredentialsNonExpired() {
        return this.deleted == EntityConstance.Common.DELETED_NO;
    }

    //是否可用 ,禁用的用户不能身份验证
    @Override
    public boolean isEnabled() {
        return this.deleted == EntityConstance.Common.DELETED_NO;
    }

    public void setRoles(Set<Long> roleIds) {
        Collection<GrantedAuthority> authorities = new HashSet<>();
        for (Long roleId : roleIds) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(roleId.toString());
            authorities.add(authority);
        }
        this.roles=authorities;
    }

}
