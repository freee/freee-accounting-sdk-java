package jp.co.freeee.accounting.samples.basic.web.config;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.RedirectServerLogoutSuccessHandler;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain configure(ServerHttpSecurity http) throws Exception {
        RedirectServerLogoutSuccessHandler logoutHandler = new RedirectServerLogoutSuccessHandler();
        logoutHandler.setLogoutSuccessUrl(URI.create("/"));
        return http
                .anonymous()
                .and().authorizeExchange()
                .pathMatchers("/", "/webjars/**", "/error**").permitAll()
                .anyExchange().authenticated()
                .and().oauth2Login()
                .and().logout().logoutUrl("/logout").logoutSuccessHandler(logoutHandler)
                .and().build();
    }
}