package com.client.newsBlog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers("/", "/index/**", "/resources/**", "/merchant-profile/**",
                                "/nurse-profile/**", "/transactionCtoM/**").permitAll()

                        .requestMatchers("/logout", "/signupUser", "/forgetPass",
                                "/forget-resendOTP", "/forget-otpCheck", "/changePassword").permitAll()
//                        .requestMatchers("/auth/**").hasRole("ADMIN")
                        .requestMatchers("/auth/**").permitAll()

                        .requestMatchers("/assets/**", "/images/**", "/fonts/**",
                                "/resources/**", "/static/**", "/images",
                                "/css/**", "/js/**", "/js", "/css").permitAll()

                        .requestMatchers("/boostrapVendor/**", "/boostrapVendor/*...", "/boostrapVendor").permitAll()
        );

        http
                .formLogin(form ->
                        form
                                .loginPage("/loginUser")
                                .successHandler(new RoleBasedAuthenticaionSuccessHandler())
                                .failureUrl("/index?loginError")
                                .permitAll()
                )
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/index")
                                .permitAll()
                );
                http
                .csrf(csrf -> csrf.disable());


        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
