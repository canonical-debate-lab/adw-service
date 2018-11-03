java_library(
    name = "websocket_api",
    exports = [
        "//external:jar/org/eclipse/jetty/websocket/websocket_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "websocket_client",
    exports = [
        "//3rdparty/jvm/org/eclipse/jetty:jetty_client",
        "//external:jar/org/eclipse/jetty/websocket/websocket_client"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "websocket_common",
    exports = [
        "//external:jar/org/eclipse/jetty/websocket/websocket_common",
        ":websocket_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "websocket_server",
    exports = [
        "//external:jar/org/eclipse/jetty/websocket/websocket_server",
        ":websocket_client",
        ":websocket_common",
        ":websocket_servlet"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "websocket_servlet",
    exports = [
        "//external:jar/org/eclipse/jetty/websocket/websocket_servlet"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


