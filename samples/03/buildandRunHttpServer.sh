#!/bin/bash

# URL of the Vert.x core library JAR file
VERTX_URL="https://repo1.maven.org/maven2/io/vertx/vertx-core/4.5.7/vertx-core-4.5.7.jar"

# File name of the Vert.x core library JAR file
VERTX_JAR="vertx-core-4.5.7.jar"

# URL of the Netty handler library JAR file
NETTY_HANDLER_URL="https://repo1.maven.org/maven2/io/netty/netty-handler/4.1.108.Final/netty-handler-4.1.108.Final.jar"

# File name of the Netty handler library JAR file
NETTY_HANDLER_JAR="netty-handler-4.1.108.Final.jar"

# URL of the Netty common library JAR file
NETTY_COMMON_URL="https://repo1.maven.org/maven2/io/netty/netty-common/4.1.108.Final/netty-common-4.1.108.Final.jar"

# File name of the Netty common library JAR file
NETTY_COMMON_JAR="netty-common-4.1.108.Final.jar"

# URL of the Netty buffer library JAR file
NETTY_BUFFER_URL="https://repo1.maven.org/maven2/io/netty/netty-buffer/4.1.108.Final/netty-buffer-4.1.108.Final.jar"

# File name of the Netty buffer library JAR file
NETTY_BUFFER_JAR="netty-buffer-4.1.108.Final.jar"

# URL of the Netty transport library JAR file
NETTY_TRANSPORT_URL="https://repo1.maven.org/maven2/io/netty/netty-transport/4.1.108.Final/netty-transport-4.1.108.Final.jar"

# File name of the Netty transport library JAR file
NETTY_TRANSPORT_JAR="netty-transport-4.1.108.Final.jar"

# URL of the Netty resolver library JAR file
NETTY_RESOLVER_URL="https://repo1.maven.org/maven2/io/netty/netty-resolver/4.1.108.Final/netty-resolver-4.1.108.Final.jar"

# File name of the Netty resolver library JAR file
NETTY_RESOLVER_JAR="netty-resolver-4.1.108.Final.jar"

# Download the Vert.x core library JAR file using curl
curl -o $VERTX_JAR $VERTX_URL

# Check if download was successful
if [ $? -eq 0 ]; then
    echo "Vert.x core library downloaded successfully."

    # Download the Netty handler library JAR file using curl
    curl -o $NETTY_HANDLER_JAR $NETTY_HANDLER_URL

    # Check if download was successful
    if [ $? -eq 0 ]; then
        echo "Netty handler library downloaded successfully."

        # Download the Netty common library JAR file using curl
        curl -o $NETTY_COMMON_JAR $NETTY_COMMON_URL

        # Check if download was successful
        if [ $? -eq 0 ]; then
            echo "Netty common library downloaded successfully."

            # Download the Netty buffer library JAR file using curl
            curl -o $NETTY_BUFFER_JAR $NETTY_BUFFER_URL

            # Check if download was successful
            if [ $? -eq 0 ]; then
                echo "Netty buffer library downloaded successfully."

                # Download the Netty transport library JAR file using curl
                curl -o $NETTY_TRANSPORT_JAR $NETTY_TRANSPORT_URL

                # Check if download was successful
                if [ $? -eq 0 ]; then
                    echo "Netty transport library downloaded successfully."

                    # Download the Netty resolver library JAR file using curl
                    curl -o $NETTY_RESOLVER_JAR $NETTY_RESOLVER_URL

                    # Check if download was successful
                    if [ $? -eq 0 ]; then
                        echo "Netty resolver library downloaded successfully."

                        # Compile Java source files
                        javac -cp "$VERTX_JAR:$NETTY_HANDLER_JAR:$NETTY_COMMON_JAR:$NETTY_BUFFER_JAR:$NETTY_TRANSPORT_JAR:$NETTY_RESOLVER_JAR" SimpleHttpServer.java

                        # Check if compilation was successful
                        if [ $? -eq 0 ]; then
                            echo "Compilation successful."

                            # Run the HTTP server
                            java -cp ".:$VERTX_JAR:$NETTY_HANDLER_JAR:$NETTY_COMMON_JAR:$NETTY_BUFFER_JAR:$NETTY_TRANSPORT_JAR:$NETTY_RESOLVER_JAR" SimpleHttpServer
                        else
                            echo "Compilation failed."
                        fi
                    else
                        echo "Failed to download Netty resolver library."
                    fi
                else
                    echo "Failed to download Netty transport library."
                fi
            else
                echo "Failed to download Netty buffer library."
            fi
        else
            echo "Failed to download Netty common library."
        fi
    else
        echo "Failed to download Netty handler library."
    fi
else
    echo "Failed to download Vert.x core library."
fi
