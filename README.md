<h1 align="center"> JUnit </h1>

# Content

1. [Chapter 1: Introducing JUnit](#chapter1)
    - [Chapter 1 - Part 1: What is JUnit?](#chapter1part1)
2. [Chapter 2: Knowing JUnit](#chapter2)
    - [Chapter 2 - Part 1: First Project](#chapter2part1)

## <a name="chapter1"></a>Chapter 1: Introducing JUnit

<br>

<div align="center"><img src="img/testimg-w1000-h500.png" width=1000 height=500><br><sub>Test Image - (<a href='https://github.com/vitorstabile'>Work by Vitor Garcia</a>) </sub></div>

<br>
  
#### <a name="chapter1part1"></a>Chapter 1 - Part 1: What is JUnit?

Testing is the process of checking the functionality of an application to ensure it runs as per requirements. Unit testing comes into picture at the developers’ level; it is the testing of single entity (class or method). Unit testing plays a critical role in helping a software company deliver quality products to its customers.

Unit testing can be done in two ways − manual testing and automated testing.

| Manual Testing                                                                                                                    | Automated Testing                                                                                                                    | 
| :-------------------------------------------------------------------------------------------------------------------------------- | :-----------------------------------------------------------------------------------------------------------------------------------:|
| Executing a test cases manually without any tool support is known as manual testing.                                              | Taking tool support and executing the test cases by using an automation tool is known as automation testing.                         |
| **Time-consuming and tedious** − Since test cases are executed by human resources, it is very slow and tedious.                   | **Fast** − Automation runs test cases significantly faster than human resources.                                                     |
| **Huge investment in human resources** − As test cases need to be executed manually, more testers are required in manual testing. | **Less investment in human resources** − Test cases are executed using automation tools, so less number of testers are required in automation testing.|
| **Less reliable** − Manual testing is less reliable, as it has to account for human errors.                                       | **More reliable** − Automation tests are precise and reliable.                                                                       |
| **Non-programmable** − No programming can be done to write sophisticated tests to fetch hidden information.                       | **Programmable** − Testers can program sophisticated tests to bring out hidden information.                                          |

**What is JUnit ?**

JUnit is a unit testing framework for Java programming language. It plays a crucial role test-driven development, and is a family of unit testing frameworks collectively known as xUnit.

JUnit promotes the idea of "first testing then coding", which emphasizes on setting up the test data for a piece of code that can be tested first and then implemented. This approach is like "test a little, code a little, test a little, code a little." It increases the productivity of the programmer and the stability of program code, which in turn reduces the stress on the programmer and the time spent on debugging.

**Features of JUnit**

- JUnit is an open source framework, which is used for writing and running tests.

- Provides annotations to identify test methods.

- Provides assertions for testing expected results.

- Provides test runners for running tests.

- JUnit tests allow you to write codes faster, which increases quality.

- JUnit is elegantly simple. It is less complex and takes less time.

- JUnit tests can be run automatically and they check their own results and provide immediate feedback. There's no need to manually comb through a report of test results.

- JUnit tests can be organized into test suites containing test cases and even other test suites.

- JUnit shows test progress in a bar that is green if the test is running smoothly, and it turns red when a test fails.

**What is a Unit Test Case ?**

A Unit Test Case is a part of code, which ensures that another part of code (method) works as expected. To achieve the desired results quickly, a test framework is required. JUnit is a perfect unit test framework for Java programming language.

A formal written unit test case is characterized by a known input and an expected output, which is worked out before the test is executed. The known input should test a precondition and the expected output should test a post-condition.

There must be at least two unit test cases for each requirement − one positive test and one negative test. If a requirement has sub-requirements, each sub-requirement must have at least two test cases as positive and negative.

## <a name="chapter2"></a>Chapter 2: Knowing JUnit
  
#### <a name="chapter2part1"></a>Chapter 1 - Part 1: First Project

First, download Maven and follow the install in your machine. After that, type the following in a terminal or in a command prompt:

```
mvn --version
````

It should print out your installed version of Maven, for example:

```
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: D:\apache-maven-3.6.3\apache-maven\bin\..
Java version: 1.8.0_232, vendor: AdoptOpenJDK, runtime: C:\Program Files\AdoptOpenJDK\jdk-8.0.232.09-hotspot\jre
Default locale: en_US, platform encoding: Cp1250
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

**Creating a Project**

You need somewhere for your project to reside. Create a directory somewhere and start a shell in that directory. On your command line, execute the following Maven goal:

```
mvn archetype:generate -DgroupId=com.example.testapp -DartifactId=my-test-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Now, Let's Open the pom.xml file, and let's populate with this configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example.testapp</groupId>
  <artifactId>my-test-app</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>my-test-app</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <java.version>21</java.version>
  </properties>

  <dependencies>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.21.0</version>
      <scope>test</scope>
    </dependency>

  </dependencies>

  <build>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
        <configuration>
          <release>11</release>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

