# POC Fournisseurs d'identités externes

L'object de ce POC est de démontrer l'intégrabilité de fournisseurs d'identités tiers selon les protocoles : 
- OpenID Connect, et
- SAML v2,
Ainsi que la possibilité de fédérer des identités par l'intégration d'un annuaire externe

Le POC repose sur la mise en oeuvre de l'outil Keycloak qui fournit nativement ces possibilités.

## Pré-requis

- Docker / Docker compose
- Java 17 (+)
- Maven 3.8.x (+)
- Bash

## Présentation de la solution

### Vision fonctionnelle

 ![Vision Fonctionnelle](/docs/ressources/vision-fonctionnelle.png)


### Vision Réseau (mise en oeuvre Docker)

![Vision Réseau sous Docker](/docs/ressources/vision-reseau-docker.png)


## Utilisation

1. Créer un réseau dans Docker : `docker network create --drive=bridge --subnet=172.31.0.0/16 idp-network`
