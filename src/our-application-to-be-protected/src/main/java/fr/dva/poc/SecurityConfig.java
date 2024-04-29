package fr.dva.poc;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;
import org.springframework.web.server.WebSession;

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity(useAuthorizationManager = true)
public class SecurityConfig {

  @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
  private String jwkSetURI;

  /**
   * Rôle Responsable fonctionnel
   */
  public static final String REALM_ROLE_RESPONSABLE_FONCTIONEL = "role_responsable_fonctionnel";

  private final ReactiveClientRegistrationRepository clientRegistrationRepository;

  public SecurityConfig(ReactiveClientRegistrationRepository clientRegistrationRepository) {
    this.clientRegistrationRepository = clientRegistrationRepository;
  }

  @Bean
  SecurityWebFilterChain ourAppSecurityFilterChain(ServerHttpSecurity httpSecurity) throws Exception {

    // @formatter:off
		httpSecurity
		.authorizeExchange(auth -> auth. pathMatchers("/public").permitAll()
				                           .pathMatchers("/").permitAll()
				                           .pathMatchers("/error").permitAll()
                                           .pathMatchers("/static/**").permitAll()
				                           .anyExchange().authenticated())
		.anonymous(anonymous -> anonymous.disable())
		.oauth2Login(withDefaults())
		.oauth2Client(Customizer.withDefaults())
		.logout(logout -> logout.logoutUrl("/logout")
		    	                .logoutSuccessHandler(oidcLogoutSuccessHandler()))
        .exceptionHandling(exception -> exception.accessDeniedHandler(new CustomAccessDeniedHandler()))
        .oauth2ResourceServer((resourceServer) -> resourceServer.jwt(withDefaults()));
		
		// @formatter:on

    return httpSecurity.build();
  }

  private ServerLogoutSuccessHandler oidcLogoutSuccessHandler() {
    final OidcClientInitiatedServerLogoutSuccessHandler oidcClientInitiatedServerLogoutSuccessHandler = new OidcClientInitiatedServerLogoutSuccessHandler(
        clientRegistrationRepository);
    return (exchange, authentication) -> {
      exchange.getExchange().getSession().flatMap(WebSession::invalidate);
      authentication.setAuthenticated(false);
      oidcClientInitiatedServerLogoutSuccessHandler.setPostLogoutRedirectUri("http://localhost:8080/");
      return oidcClientInitiatedServerLogoutSuccessHandler.onLogoutSuccess(exchange, authentication);
    };
  }

}
