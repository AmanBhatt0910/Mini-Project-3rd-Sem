//package edu.graphicera.librarymanagement.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.*;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfiguration {
//
//    protected void configure(HttpSecurity http) throws Exception {
//        // Disable security features
//        http
//            .authorizeRequests()
//                .requestMatchers("/**").permitAll()
//                .and()
//            .csrf().disable()
//            .headers().frameOptions().disable();
//    }
//}
