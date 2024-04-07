#!/bin/bash

SNAKEYAML_VERSION="2.2"
SNAKEYAML_JAR="snakeyaml-$SNAKEYAML_VERSION.jar"
SNAKEYAML_URL="https://repo1.maven.org/maven2/org/yaml/snakeyaml/$SNAKEYAML_VERSION/$SNAKEYAML_JAR"

curl -o "$SNAKEYAML_JAR" "$SNAKEYAML_URL"
[ $? -eq 0 ] || { echo "Download failed."; exit 1; }

javac -cp "$(basename $SNAKEYAML_JAR)" SnakeYAMLReadExample.java
[ $? -eq 0 ] || { echo "Compilation failed."; exit 1; }

java -cp ".:$SNAKEYAML_JAR" SnakeYAMLReadExample

rm -f "$SNAKEYAML_JAR" SnakeYAMLReadExample.class
