package fr.dva.poc;

import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class JwtHelper {

  private static final Base64.Decoder BASE64_DECODER = Base64.getUrlDecoder();
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private static final String CLAIM_REALM_ACCESS = "realm_access";
  private static final String CLAIM_ROLES = "roles";
  private static final String CLAIM_GROUPS = "groups";

  private String getJwtPayload(final String tokenValue) {
    return new String(BASE64_DECODER.decode(splitTokenValue(tokenValue)[1]));
  }

  public Set<String> getRealmAccessRoles(final String tokenValue) throws JsonMappingException, JsonProcessingException {

    return getClaimsRolesValues(tokenValue, CLAIM_REALM_ACCESS);

  }

  public Set<String> getGroupsRoles(final String tokenValue) throws JsonMappingException, JsonProcessingException {

    return getClaimsRolesValues(tokenValue, CLAIM_GROUPS);

  }

  private Set<String> getClaimsRolesValues(final String tokenValue, final String claimType)
      throws JsonMappingException, JsonProcessingException {
    log.info("<<<<< ========== Récupération des rôles de l'utilisateur ========== >>>>>");
    log.debug(tokenValue);
    Set<String> result = new HashSet<String>();
    String payload = this.getJwtPayload(tokenValue);
    JsonNode jsonNode = MAPPER.readTree(payload);
    JsonNode roles;
    switch (claimType) {
    case CLAIM_REALM_ACCESS:
      roles = jsonNode.get(CLAIM_REALM_ACCESS).get(CLAIM_ROLES);
      break;
    case CLAIM_GROUPS:
      roles = jsonNode.get(CLAIM_GROUPS);
      break;
    default:
      throw new IllegalArgumentException("Unexpected value: " + claimType);
    }

    if (roles.isArray()) {
      for (final JsonNode role : roles) {
        String roleTextValue = role.textValue();
        log.info("Role {} added to user granted authorities", roleTextValue);
        result.add(roleTextValue);
        log.debug("Extraction du role {} pour ajout dans le contexte de sécurité de l'utilisateur courant", role);
      }
    }

    return result;

  }

  /**
   *
   * @param tokenValue
   */
  private String[] splitTokenValue(final String tokenValue) {
    return tokenValue.split("\\.");
  }

}