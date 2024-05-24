# From Sockets to Servlets

<!-- https://mermaid.js.org/syntax/examples.html -->
<pre class="mermaid">

sequenceDiagram

    participant Client as Client(s)
    participant JSP
    participant SessionListener
    participant ServletContext
    participant WebSocket as WebSocket(s)
    participant WebSocketList
    participant Client2 as New Client

    Client ->>+JSP: HTTP GET
    JSP-->>+SessionListener: HTTP Session created
    SessionListener->> ServletContext: increment HTTP Session Counter
    SessionListener->> WebSocketList: notify
    Note over WebSocketList,WebSocketList: nothing to broadcast to
    JSP->>+ServletContext: query HTTP Session Counter
    ServletContext-->>-JSP: retun HTTP Session Counter
    JSP-->>-Client: HTML
    Client ->>+WebSocket: open
    WebSocket -->> WebSocketList: register
    WebSocket-->>Client: opened
    Note over Client2: New client connects and HTTP Session is created
    Client2->>WebSocketList: notify (abbreviated)
    WebSocketList->>+ServletContext: query HTTP Session Counter
    ServletContext-->>-WebSocketList: return HTTP Session Counter
    loop WebSocket(s)
        WebSocketList-->>WebSocket: broadcast
    end
    WebSocket-->>Client: message
    
    Client-->>WebSocket: close
    WebSocket-->>-Client: closed
    
</pre>
