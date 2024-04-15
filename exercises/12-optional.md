#  Exercises - Graphical User Interface 

#### Debug the program from the command line with maven

In pom.xml, add the following xml snippet to javafx-maven-plugin ```<executions>```:

```xml
<execution>
    <!-- Configuration for manual attach debugging -->
    <!-- Usage: mvn clean javafx:run@debug -->
    <id>debug</id>
    <configuration>
        <options>
            <option>-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=localhost:8000</option>
        </options>
        <mainClass>com.example.App</mainClass>
    </configuration>
</execution>
<execution>
    <!-- Configuration for automatic IDE debugging -->
    <id>ide-debug</id>
    <configuration>
        <options>
            <option>-agentlib:jdwp=transport=dt_socket,server=n,address=${jpda.address}</option>
        </options>
        <mainClass>com.cthiebaud.javafx.App</mainClass>
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
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "App",
            "request": "launch",
            "mainClass": "com.cthiebaud.javafx/com.cthiebaud.javafx.App",
            "projectName": "demo"
        },
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

Open a terminal, type ```mvnDebug javafx:run@Debug```
Run "Debug (Attach)" from "Run and Debug" (⇧⌘D)

<img src="/images/29115.svg" alt="separator" class="frise">
