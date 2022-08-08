package com.example.SpringSecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {



        http.authorizeRequests()
                .anyRequest()
//                .permitAll();
                .authenticated()
                .and()
                .formLogin();

        // any request - > what do we do with any request?

        //http.httpBasic();


        //What if I want to permit some end points but not others?
//        http.authorizeRequests()
//                .antMatchers("/hello")
//                .permitAll();
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authz) -> authz
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();

        String username = "thomas";
        String password = "coolguypassword";
        UserDetails thisUser = User.withUsername(username)
                .password(passwordEncoder().encode(password))
                .authorities("read")
                .build();
        //Create the
        userDetailService.createUser(thisUser);

        return userDetailService;
    }

    // Use a bean to determine which Password Encoder will be used.
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
