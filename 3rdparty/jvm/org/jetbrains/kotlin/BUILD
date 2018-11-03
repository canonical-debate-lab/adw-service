java_library(
    name = "kotlin_reflect",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_reflect",
        ":kotlin_stdlib"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "kotlin_stdlib",
    exports = [
        "//3rdparty/jvm/org/jetbrains:annotations",
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib",
        ":kotlin_stdlib_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "kotlin_stdlib_common",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "kotlin_stdlib_jdk7",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib_jdk7"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "kotlin_stdlib_jdk8",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib_jdk8",
        ":kotlin_stdlib",
        ":kotlin_stdlib_jdk7"
    ],
    visibility = [
        "//visibility:public"
    ]
)


