/*
 * package com.seed;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import org.springframework.security.core.userdetails.User;
 * import org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class AppSecurity {
 * 
 * @Bean public UserDetailsService UserDetailsService(){ List<UserDetails> user
 * = new ArrayList<UserDetails>();
 * user.add(User.withDefaultPasswordEncoder().username("Sanket").password("abcd"
 * ).build());
 * user.add(User.withDefaultPasswordEncoder().username("raj").password("1234").
 * build());
 * 
 * return new InMemoryUserDetailsManager(user); } }
 * 
 */