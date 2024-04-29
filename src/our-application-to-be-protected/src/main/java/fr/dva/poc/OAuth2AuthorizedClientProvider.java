package fr.dva.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class OAuth2AuthorizedClientProvider {

  @Autowired
  private ReactiveOAuth2AuthorizedClientService clientService;

  public Mono<OAuth2AuthorizedClient> getClient(OAuth2AuthenticationToken oauthToken) {
    return clientService.loadAuthorizedClient(oauthToken.getAuthorizedClientRegistrationId(), oauthToken.getName());
  }

}
