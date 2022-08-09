package com.example.SpringSecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration { //extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 1. Basic Authorize All!
//        http.authorizeRequests()
//                .anyRequest()
//                .permitAll();
//    } <- the real semicolon is way below.

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // 2. Only allow authenticated users
        //      - Default username: user
        //      - Auto Generated Password.
        // 3. And a Login Form
        // 4. And a Logout Form
        // 5. Creating a UserDetailsService
        //      - Custom Authenticated User
        // 6. Permit some end points but not other

        // What if I want to permit some end points but not others?
//        http.authorizeRequests()
//                .antMatchers("/hello")
//                .permitAll();

//        http.authorizeRequests()
//                .antMatchers("/status")
//                .hasAuthority("admin");

        // any request
        //    -> what do we do with any request?
//        http
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .logout();

        // What if we want to permit some end points
        // *** Based Upon User Authority ***


        /*******************  PART TWO: OAuth ********************/
        // Using: https://www.baeldung.com/spring-security-5-oauth2-login
        // Set up security for Hello Api URLS only
        // How to do this?

        // Authorize requests to status
        // only if user has Admin Authority
        http.authorizeRequests()
                .antMatchers("/helloAPI/status")
                .hasAuthority("/admin");

        // Authorize requests to all
        // only if user is authenticated.
        http.authorizeRequests()
                .antMatchers("/helloAPI/**")
                .authenticated()
                .and()
                .oauth2Login()
                .and()
                .logout();


        // Require Authentication for all content via OAuth
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .oauth2Login();

        //Temporarily Commented Out:
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();

        String username = "thomas";
        String password = "1234";
        UserDetails thisUser = User.withUsername(username)
                .password(passwordEncoder().encode(password))
                .authorities("read")
                .build();

        // Add the User into the Services Map.
        userDetailService.createUser(thisUser);

        // Let's give Jay an account too!
        username = "Jay";
        password = "SecUr3P@ssw0rD!@#2341dsa@#!";
        thisUser = User.withUsername(username)
                .password(passwordEncoder().encode(password))
                .authorities("admin")
                .build();

        userDetailService.createUser(thisUser);
        // What if we want to make Jay (with his more secure password)
        // an administrator?

        return userDetailService;
    }

    // Use a bean to determine which Password Encoder will be used.
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /*******************  PART TWO: OAuth ********************/

}


