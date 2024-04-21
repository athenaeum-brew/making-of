# JavaFX WebView


```  
        graph TD
        A[Client] --> B[Load Balancer]
        B --> C[Server01]
        B --> D[Server02]
```

<pre  class="mermaid">
        graph TD
        A[Client] --> B[Load Balancer]
        B --> C[Server01]
        B --> D[Server02]


</pre>

<pre  class="mermaid">
classDiagram
    note "From Duck till Zebra"
    Animal <|-- Duck
    note for Duck "can fly\ncan swim\ncan dive\ncan help in debugging"
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
</pre>



---

# JavaFX WebView

### Handling Loading Errors

```java
webView.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
    if (newValue == Worker.State.FAILED) {
        // Handle loading error
        System.out.println("Failed to load page: " + webView.getEngine().getLocation());
    }
});
```

--- 

# JavaFX WebView

### Advanced: Bridging Between Java and HTML+JavaScript


--- 

