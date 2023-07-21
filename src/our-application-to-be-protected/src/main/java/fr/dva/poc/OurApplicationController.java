package fr.dva.poc;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@CrossOrigin
@Log4j2
public class OurApplicationController {

	@GetMapping("/")
	public String root(Principal principal, Model model) {
		return publicIndex(principal, model);
	}

	@GetMapping("/public/")
	public String publicIndex(Principal principal, Model model) {
		if (null != principal) {
			model.addAttribute("utilisateur", principal.getName());
		}
		return "public/index";
	}

	@GetMapping("/secured/")
	public String securedIndex(Principal principal, Model model) {
		if (null != principal) {
			model.addAttribute("utilisateur", principal.getName());
		}
		return "secured/index";
	}

	@GetMapping("/error")
	public String error(Principal principal, Model model) {
		if (null != principal) {
			model.addAttribute("utilisateur", principal.getName());
		}
		return publicIndex(principal, model);
	}

}
