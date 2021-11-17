package com.codegym.config;

import com.codegym.service.impl.MyUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/home").permitAll()
                .and()

                .authorizeRequests().antMatchers("/home").permitAll()//

                .antMatchers("/blog").hasAnyRole("USER","ADMIN")
                .antMatchers("/blog/**").hasRole("ADMIN")

                /* all request guu len server deu pai sac thuc */
                .anyRequest().authenticated();

        http.authorizeRequests().and().rememberMe().tokenRepository(this.persistentTokenRepository()).tokenValiditySeconds(60*60*5);

    }
    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        InMemoryTokenRepositoryImpl inMemoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return inMemoryTokenRepository;
    }
}
