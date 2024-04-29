package fr.dva.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "/api/v1/pays")
@RequiredArgsConstructor
public class PaysEtTerritoiresEtrangersController {

  private final PaysEtTerritoiresEtrangersServices service;

  @GetMapping
  public Flux<PaysEtTerritoiresEtrangers> getAll() {
    return service.findAll();
  }

}
