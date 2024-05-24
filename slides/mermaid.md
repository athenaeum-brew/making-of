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
    JSP->>+ServletContext: query HTTP Session Counter
    ServletContext-->>-JSP: retun HTTP Session Counter
    JSP-->>-Client: HTML
    Client ->>+WebSocket: open
    WebSocket -->> WebSocketList: register
    WebSocket-->>Client: opened
    Client2-->>WebSocketList: notify (abbr.)
    WebSocketList->>+ServletContext: query HTTP Session Counter
    ServletContext-->>-WebSocketList: return HTTP Session Counter
    WebSocketList-->>WebSocket: broadcast
    WebSocket-->>Client: message
    
    Client-->>WebSocket: close
    WebSocket-->>-Client: closed
</pre>
