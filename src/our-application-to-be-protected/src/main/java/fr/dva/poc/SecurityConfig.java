package fr.dva.poc;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	ClientRegistrationRepository clientRegistrationRepository;

	@Bean
	public SecurityFilterChain ourAppSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {

		LogoutSuccessHandler logoutHandler = new OidcClientInitiatedLogoutSuccessHandler(
				this.clientRegistrationRepository);

		// @formatter:off
		httpSecurity
		.authorizeHttpRequests(auth -> auth.requestMatchers("/public").permitAll()
				                           .requestMatchers("/").permitAll()
				                           .requestMatchers("/error").permitAll()
				                           .anyRequest().authenticated())
		                                   .anonymous(ano -> ano.disable())
		                                   .oauth2Login(withDefaults())
		                                   .logout(logout -> logout.logoutUrl("/logout")
		                                		                   .logoutSuccessHandler(oidcLogoutSuccessHandler())
		                                		                   .invalidateHttpSession(true)
		                                		                   .clearAuthentication(true)
		                                		                   .deleteCookies("JSESSIONID"));
		// @formatter:on

		return httpSecurity.build();
	}

	private OidcClientInitiatedLogoutSuccessHandler oidcLogoutSuccessHandler() {
		final OidcClientInitiatedLogoutSuccessHandler oidcLogoutSuccessHandler = new OidcClientInitiatedLogoutSuccessHandler(
				this.clientRegistrationRepository);
		oidcLogoutSuccessHandler.setPostLogoutRedirectUri("http://localhost:8080/");
		return oidcLogoutSuccessHandler;
	}

}
