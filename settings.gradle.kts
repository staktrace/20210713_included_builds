rootProject.name = "20210713_included_builds"

includeBuild("project_a/") {
  dependencySubstitution {
    substitute(module("com.squareup.test.project_a:project_a")).with(project(":submodule"))
  }
}
includeBuild("project_b/") {
  dependencySubstitution {
    substitute(module("com.squareup.test.project_b:project_b")).with(project(":submodule"))
  }
}
