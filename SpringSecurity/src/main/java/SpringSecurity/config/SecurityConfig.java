package SpringSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic();
		http.formLogin();
		http
		.authorizeRequests()
		.antMatchers("/login").hasAnyRole("admin","user")
		.antMatchers("/admin").hasRole("admin")
		.and()
		.authorizeRequests()
		.antMatchers("/hello")
		.permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("zulfuqar").password("{noop}1234").roles("admin")
		.and()
		.withUser("ali").password("{noop}1234").roles("user");
	}

	
	
	
	
	
}
