package pl.coderslab.servicepanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
class SpringSecurity {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/reports/list").hasAnyRole("SELLER", "TECHNICIAN")
                .and()
                .exceptionHandling().accessDeniedPage("/auth/403")
                .and()
                .formLogin().loginPage("/login").defaultSuccessUrl("/report/list").and()
                .logout().logoutSuccessUrl("/auth.login");
        return http.build();
    }
}
