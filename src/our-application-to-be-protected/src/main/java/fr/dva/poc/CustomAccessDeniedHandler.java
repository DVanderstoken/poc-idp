package fr.dva.poc;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
public class CustomAccessDeniedHandler implements ServerAccessDeniedHandler {

  @Override
  public Mono<Void> handle(ServerWebExchange exchange, AccessDeniedException accessDeniedException) {

    ServerHttpResponse response = exchange.getResponse();

    response.setStatusCode(HttpStatus.TEMPORARY_REDIRECT);
    response.getHeaders().setLocation(URI.create("/error"));

    return response.setComplete();
  }

}
