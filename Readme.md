# Building Android Apps

Android 13 supports Java 11 for its core libraries, as well as some features from Java 11 and higher through API desugaring. This means developers can use more recent Java language APIs in apps that target older versions of Android. Android 14 (API 34) supports Java 17, while Android 12 and 13 support Java 11. 
[Android](https://developer.android.com/build/jdks#compileSdk)


# Useful commands

```bash
# Check version of kotlin used
kotlinc -version
# info: kotlinc-jvm 2.1.20 (JRE 21.0.7+6-LTS)

# Compile the file main.kt into the file main.jar
kotlinc main.kt -include-runtime -d main.jar

# Since the build will create an executable jar file you can invoke it with the Java Runtime Environment.
java -jar main.jar
```

# Requirements
### VS Code Setup
For up to date guidance visit [this guide](https://in-kotlin.com/ide/vscode/setup-vscode-for-kotlin-development/).



### JDK & Java
The JDK (Java Development Kit) is a software development kit used for creating Java applications, while "Java version" refers to the specific version of the Java programming language. The JDK includes everything needed to develop, compile, and run Java programs, including the JRE (Java Runtime Environment) and development tools like compilers and debuggers. The JRE, in turn, provides the runtime environment for executing Java applications

> Install JDK 21


### Install Kotlin compiler

For updates check [the official instructions](https://kotlinlang.org/docs/command-line.html).

1. Go to [Jetbrain kotlin repo release's website](https://github.com/JetBrains/kotlin/releases/tag/v2.1.20) for a desirable release.
1. Scroll to the bottom of the page and in the `Assets` section of the release page download the compiler `kotlin-compiler-2.1.20.zip` 
1. Unzip the file, add the `bin` directory to the system path, it should be self-contained.

### Installing Gradle
The VSCode Kotlin Language debugger makes use of gradle.

Visit the [Gradle website](https://docs.gradle.org/current/userguide/installation.html#windows_installation) for instructions on how to install gradle.

Also check the  compatibility between Gradle, Kotlin & Java at the [Gradle website](https://docs.gradle.org/current/userguide/compatibility.html#compatibility)

1. Go to the [Gradle release page](https://gradle.org/releases/)
1. Download the binary-only of a suitable version i.e. `v8.11`
1. Unzip the file and add the `bin` directory to the `PATH` environment variables


##### Notes

```bash
gradle build

# After executing gradle build the Kotlin Launch configuration in .vscode/launch.json works.

```

**init command**
```bash
# Create new gradle project structure
gradle init

# Select type of build to generate:
#   1: Application
#   2: Library
#   3: Gradle plugin
#   4: Basic (build structure only)
# Enter selection (default: Application) [1..4] 1

# Select implementation language:
#   1: Java
#   2: Kotlin
#   3: Groovy
#   4: Scala
#   5: C++
#   6: Swift
# Enter selection (default: Java) [1..6] 2

# Enter target Java version (min: 7, default: 21): 21

# Project name (default: learn-kotlin):

# Select application structure:
#   1: Single application project
#   2: Application and library project
# Enter selection (default: Single application project) [1..2] 1

# Select build script DSL:
#   1: Kotlin
#   2: Groovy
# Enter selection (default: Kotlin) [1..2] 1

# Select test framework:
#   1: kotlin.test
#   2: JUnit Jupiter
# Enter selection (default: kotlin.test) [1..2] 1

# Select application structure:
#   1: Single application project
#   2: Application and library project
# Enter selection (default: Single application project) [1..2] 1

# Select build script DSL:
#   1: Kotlin
#   2: Groovy
# Enter selection (default: Kotlin) [1..2] 1

# Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] yes

```