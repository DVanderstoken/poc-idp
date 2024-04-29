package fr.dva.poc;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class OurApplicationController {
  
  private final PaysEtTerritoiresEtrangersServices paysEtTerritoiresEtrangersServices;

  @GetMapping("/")
  public String root(Model model, @AuthenticationPrincipal OAuth2User principal) {
    return publicIndex(model, principal == null ? null : principal);
  }

  @GetMapping("/public/")
  public String publicIndex(Model model, @AuthenticationPrincipal OAuth2User principal) {
    if (null != principal) {
      model.addAttribute("utilisateur", principal.getName());
      if (null != principal.getAttribute("groups")) {
        model.addAttribute("group", principal.getAttribute("groups"));
      }
    }
    return "public/index";
  }

  @GetMapping("/secured/")
  @PreAuthorize("@SecurityService.hasGroup('our-application-group', #principal)")
  public Mono<String> securedIndex(Model model, @AuthenticationPrincipal OAuth2User principal) {
    if (null != principal) {
      model.addAttribute("utilisateur", principal.getName());
      if (null != principal.getAttribute("groups")) {
        model.addAttribute("group", principal.getAttribute("groups"));
      }
    }
    return Mono.just("secured/index");
  }

  @GetMapping("/error")
  public String error(Model model, @AuthenticationPrincipal OAuth2User principal) {
    if (null != principal) {
      model.addAttribute("utilisateur", principal.getName());
    }
    return "/error";
  }

}
