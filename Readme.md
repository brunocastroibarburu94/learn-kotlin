# Building Android Apps

Android 13 supports Java 11 for its core libraries, as well as some features from Java 11 and higher through API desugaring. This means developers can use more recent Java language APIs in apps that target older versions of Android. Android 14 (API 34) supports Java 17, while Android 12 and 13 support Java 11. 
[Android](https://developer.android.com/build/jdks#compileSdk)


# Useful commands

```bash
# Compile the file main.kt into the file main.jar
kotlinc main.kt -include-runtime -d main.jar

# Since the build will create an executable jar file you can invoke it with the Java Runtime Environment.
java -jar main.jar
```

# Requirements
### VS Code Setup
For up to date guidance visit [this guide](https://in-kotlin.com/ide/vscode/setup-vscode-for-kotlin-development/).


 <!-- a read on this guide  -->

### JDK & Java
The JDK (Java Development Kit) is a software development kit used for creating Java applications, while "Java version" refers to the specific version of the Java programming language. The JDK includes everything needed to develop, compile, and run Java programs, including the JRE (Java Runtime Environment) and development tools like compilers and debuggers. The JRE, in turn, provides the runtime environment for executing Java applications

> Install JDK 21


### Install Kotlin compiler

For updates check [the official instructions](https://kotlinlang.org/docs/command-line.html).

1. Go to [Jetbrain's kotlin repo release's website](https://github.com/JetBrains/kotlin/releases/tag/v2.1.20) for a desirable release.
1. Scroll to the bottom of the page and in the `Assets` section of the release page download the compiler `kotlin-compiler-2.1.20.zip` 
1. Unzip the file, add the `bin` directory to the system path, it should be self-contained.