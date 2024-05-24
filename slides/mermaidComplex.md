# From Sockets to Servlets

<!-- https://mermaid.js.org/syntax/examples.html-->
<pre class="mermaid">

sequenceDiagram

    participant Client
    participant Client2
    participant JSP
    participant SessionListener
    participant ServletContext
    participant WebSocket
    participant WebSocket2
    participant WebSocketList

    Client ->>+JSP: HTTP GET
    JSP ->>+SessionListener: HTTP Session created
    SessionListener -->> ServletContext: Increment HTTP Session counter
    SessionListener -->> WebSocketList: Notify WebSocketList of change
    ServletContext-->>JSP: get current HTTP Session counter
    JSP-->>-Client: HTML Response
    Client ->>+WebSocket: Request to establish web Socket 
    WebSocket -->> WebSocketList: add web socket client to list
    WebSocket-->>Client: web socket opened 

    Client2 ->>+JSP: HTTP GET
    JSP ->>+SessionListener: HTTP Session created
    SessionListener -->> ServletContext: Increment HTTP Session counter
    SessionListener -->> WebSocketList: Notify WebSocketList of change
    WebSocketList-->> Client: update HTTP Session Counter
    ServletContext-->>JSP: get current HTTP Session counter
    JSP-->>-Client2: HTML Response
    Client2 ->>+WebSocket2: Request to establish web Socket 
    WebSocket2 -->> WebSocketList: add web socket client to list
    WebSocket2-->>Client2: web socket opened 


    WebSocket->-Client: close web socket
    WebSocket2->-Client2: close web socket
</pre>

