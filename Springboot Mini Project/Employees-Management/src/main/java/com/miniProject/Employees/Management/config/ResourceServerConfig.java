package com.miniProject.Employees.Management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "resource_id";
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
        http
				.headers()
				.frameOptions()
				.disable()

				//--------Endpoint configuration for ADMIN and USER access ----------

				.disable()
                .authorizeRequests()
				.antMatchers(HttpMethod.POST, "/user/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.PUT, "/user/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.DELETE, "/user/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.GET, "/user/**").access("hasAnyRole('ADMIN','USER')")

				.antMatchers(HttpMethod.POST, "/employee/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.PUT, "/employee/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.DELETE, "/employee/**").access("hasRole('ADMIN')")
				.antMatchers(HttpMethod.GET, "/employee/**").access("hasAnyRole('ADMIN','USER')")
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}

}