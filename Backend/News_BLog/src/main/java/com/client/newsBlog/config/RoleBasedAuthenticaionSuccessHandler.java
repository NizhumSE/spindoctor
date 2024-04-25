package com.client.newsBlog.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import java.util.Collection;

public class RoleBasedAuthenticaionSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Override
    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        System.out.println(authorities);
        if (authorities.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            return "/auth/merchants";
        } else if (authorities.contains(new SimpleGrantedAuthority("ROLE_USER"))) {
            return "/index";
        } else {
            return "/auth/merchants";
        }
    }
}
