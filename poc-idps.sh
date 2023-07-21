#!/bin/bash
set -euo pipefail

# Reset
Color_Off='\033[0m'       # Text Reset

# Regular Colors
Black='\033[0;30m'        # Black
Red='\033[0;31m'          # Red
Green='\033[0;32m'        # Green
Yellow='\033[0;33m'       # Yellow
Blue='\033[0;34m'         # Blue
Purple='\033[0;35m'       # Purple
Cyan='\033[0;36m'         # Cyan
White='\033[0;37m'        # White

# High Intensity
IBlack='\033[0;90m'       # Black
IRed='\033[0;91m'         # Red
IGreen='\033[0;92m'       # Green
IYellow='\033[0;93m'      # Yellow
IBlue='\033[0;94m'        # Blue
IPurple='\033[0;95m'      # Purple
ICyan='\033[0;96m'        # Cyan
IWhite='\033[0;97m'       # White

operation=unset
application=unset
all_application=("ours" "oidc" "ldap" "saml")

usage() {
>&2 cat << EOF
Usage: $0
   [ -s | --start ]
   [ -x | --stop ]
   [ -r | --restart ] 
   <application(s)> [ours|oidc|saml|ldap|all]
EOF
exit 1
}

delete() {
   docker-compose -f ./src/docker/$1/docker-compose-$1.yml rm -f
}

stop() {
   docker-compose -f ./src/docker/$1/docker-compose-$1.yml stop
}

start() {
   docker-compose -f ./src/docker/$1/docker-compose-$1.yml up -d --build
}

restart() {
   stop $1
   delete $1
   start $1
}

launch() {
  echo -e "${IBlue}------------------------------------------${Color_Off}"
  echo -e "${IBlue}$1 $2${Color_Off}"
  echo -e "${IBlue}------------------------------------------${Color_Off}"
  $1 $2
}

args=$(getopt -a -o sxr --long start,stop,restart -- "$@")
if [[ $? -gt 0 ]]; then
  usage
fi

eval set -- ${args}
while :
do
  case $1 in
    -s | --start)   operation="start"  ; shift   ;;
    -x | --stop)    operation="stop"           ; shift   ;;
    -r | --restart) operation="restart"        ; shift   ;;
    -d | --delete)  operation="delete"        ; shift   ;;
    -h | --help)    usage                      ; shift   ;;
    # -- means the end of the arguments; drop this, and break out of the while loop
    --) shift; break ;;
    *) >&2 echo Unsupported option: $1
       usage ;;
  esac
done

if [[ $# -eq 0 ]]; then
  usage
fi

parameter=$@

if [[ "all" == ${parameter} ]]; 
then
  for application in ${all_application[@]}; do
    launch ${operation} ${application}
  done
else 
  launch ${operation} ${parameter}
fi
