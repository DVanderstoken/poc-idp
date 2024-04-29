package fr.dva.poc;

import java.util.ArrayList;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service(value = "SecurityService")
@RequiredArgsConstructor
public class SecurityService {

  @SuppressWarnings("null")
  public Boolean hasGroup(final String groupName, OAuth2User principal) {

    // @formatter:off

    return null != principal 
        && null != principal.getAttribute("groups") 
        && ((ArrayList<String>) principal.getAttribute("groups")).contains(groupName);
    
    // @formatter:on

  }

}
