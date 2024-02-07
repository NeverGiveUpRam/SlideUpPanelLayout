import java.net.URI

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
sourceControl {
    gitRepository(URI.create("https://github.com/NeverGiveUpRam/SlideUpPanelLayout.git")) {
        producesModule("org.gradle.rk_slideUpPanelLayout:library")
    }
}
include(":library")
