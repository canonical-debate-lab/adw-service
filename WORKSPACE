load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_kotlin_version = "87bd13f91d166a8070e9bbfbb0861f6f76435e7a"

http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_import")

kotlin_repositories()
kt_register_toolchains()

git_repository(
    name = "org_pubref_rules_maven",
    commit = "9c3b07a6d9b195a1192aea3cd78afd1f66c80710",
    remote = "https://github.com/pubref/rules_maven",
)

load("@org_pubref_rules_maven//maven:rules.bzl", "maven_repositories", "maven_repository")

maven_repositories()

load("//3rdparty:workspace.bzl", "maven_dependencies")

maven_dependencies()

maven_repository(
    name = "appdeps",
    deps = [
        "io.javalin:javalin:2.3.0",
        "org.slf4j:slf4j-simple:1.7.25",
    ],
)

load("@appdeps//:rules.bzl", "appdeps_compile")
appdeps_compile()

# Imports Docker rules for Bazel (e.g. docker_image)
git_repository(
    name = "io_bazel_rules_docker",
    remote = "https://github.com/bazelbuild/rules_docker.git",
    tag = "v0.5.1",
)

load(
    "@io_bazel_rules_docker//container:container.bzl",
    "container_layer",
)

load(
    "@io_bazel_rules_docker//java:image.bzl",
    _java_image_repos = "repositories",
)

_java_image_repos()

load(
    "@io_bazel_rules_docker//container:container.bzl",
    "container_pull",
    _container = "container",
    _repositories = "repositories",
)
load("@io_bazel_rules_docker//java:java.bzl", _JAVA_DIGESTS = "DIGESTS")

container_pull(
    name = "java_image_base",
    registry = "gcr.io",
    repository = "distroless/java",
    digest = _JAVA_DIGESTS["latest"],
)