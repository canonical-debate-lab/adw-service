load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "code",
    srcs = glob(["src/main/kotlin/**/*.kt"]),
    deps = [
        ":adw",
        "@appdeps//:compile",
        #"//3rdparty/jvm/io/javalin:javalin",
        "//3rdparty/jvm/com/fasterxml/jackson/module:jackson_module_kotlin",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_stdlib",
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_reflect",
    ],
)

java_import(
    name = "adw",
    jars = [
        "lib/adw.feb2015.jar",
    ],
)

load("@io_bazel_rules_docker//java:image.bzl", "java_image")

java_image(
    name = "image",
    main_class = "com.github.cdl.adw.ServiceKt",
    runtime_deps = [
        ":code",
    ],
)

