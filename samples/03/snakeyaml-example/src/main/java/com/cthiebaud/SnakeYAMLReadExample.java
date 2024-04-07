package com.cthiebaud;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/*
 * mkdir -p snakeyaml-example/src/main/java/com/cthiebaud
mvn clean package
java -cp target/snakeyaml-example-1.0-SNAPSHOT.jar:/Users/christophe.thiebaud/.m2/repository/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar com.cthiebaud.SnakeYAMLReadExample

mvn exec:java -Dexec.mainClass="com.cthiebaud.SnakeYAMLReadExample"

mvn exec:java -q

 */
public class SnakeYAMLReadExample {
    public static void main(String[] args) throws IOException {
        // Create YAML instance
        Yaml yaml = new Yaml();

        // Define file path
        String filePath = "../example-object.yaml";

        // Read data from YAML file
        Path path = Paths.get(filePath);
        if (Files.exists(path)) {
            Map<String, Object> data = yaml.load(Files.newBufferedReader(path));
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
