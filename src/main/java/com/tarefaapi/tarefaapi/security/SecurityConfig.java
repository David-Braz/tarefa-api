package com.tarefaapi.tarefaapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


// Marks this class as a configuration class, meaning it provides Spring Beans
@Configuration

// Enables Spring Security for this application
@EnableWebSecurity
public class SecurityConfig {

    // Defines a security filter chain to control how HTTP requests are secured
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // Disables CSRF protection (Cross-Site Request Forgery)
                // WARNING: Disabling CSRF is not recommended for production unless you have a good reason
                .csrf(csrf -> csrf.disable())

                // Specifies that all HTTP requests must be authenticated (i.e., users must log in)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.POST, "/securedEndpoint").authenticated()
                        .anyRequest().permitAll()
                )

                // Enables basic authentication (username and password in a browser popup)
                .httpBasic(Customizer.withDefaults())

                // Builds and returns the configured security filter chain
                .build();
    }
}
