#  Exercises - Graphical User Interface 

#### Debug the program from the command line with maven

In pom.xml, add the following xml snippet to javafx-maven-plugin ```<executions>```:

```xml
<execution>
    <!-- Configuration for manual attach debugging -->
    <!-- Usage: mvn clean javafx:run@my-debug-id -->
    <id>my-debug-id</id>
    <configuration>
        <options>
            <option>-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=localhost:8000</option>
        </options>
        <mainClass>com.example.App</mainClass>
    </configuration>
</execution>
```

Create a file named "launch.json" in the folder ".vscode" with the following content:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Debug (Attach)",
            "request": "attach",
            "hostName": "localhost",
            "port": 8000
        }
    ]
}
```

Open a terminal, type ```mvn javafx:run@my-debug-id```

In Visual Studio, run "Debug (Attach)" from "Run and Debug" (⇧⌘D)

Full Sample at https://github.com/athenaeum-brew/javafx-examples/tree/main/javafx-example-4-stayonthescene

<img src="/images/29115.svg" alt="separator" class="frise">
