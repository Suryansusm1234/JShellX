#!/bin/sh
set -e # Exit early if any commands fail
(
  cd "$(dirname "$0")" # Ensure compile steps are run within the repository directory
  mvn -q -B package -Ddir=/tmp/build-shell-java
)
exec java -jar /tmp/build-shell-java/jshellx.jar "$@"
