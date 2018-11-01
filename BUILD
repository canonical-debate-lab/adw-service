load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "code",
    srcs = glob(["src/main/kotlin/**/*.kt"]),
    deps = [
        "@appdeps//:compile",
        ":adw",
    ],
)

java_import(
    name = "adw",
    jars = [
        "lib/adw.v1.0.jar",
        "lib/jlt-2.0.0.jar",
    ],
)

load("@io_bazel_rules_docker//java:image.bzl", "java_image")
load("@io_bazel_rules_docker//java:java.bzl", _JAVA_DIGESTS = "DIGESTS")
load("@io_bazel_rules_docker//container:container.bzl", "container_layer", "container_image", "container_pull")

container_layer(
    name = "config",
    data_path = "/config",
)

container_image(
    name = "base",
    base = ":java_image_base",
    layers = [":config"],
)

java_image(
    name = "image",
    main_class = "com.github.cdl.adw.ServiceKt",
    resource_strip_prefix = "src/main/webapp",
    resources = glob(["src/main/webapp/**/*.xml"]),
    runtime_deps = [
        ":code",
    ],
)

