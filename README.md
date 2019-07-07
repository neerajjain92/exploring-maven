# exploring-maven
Playground to explore Maven

## [The Resources Plugin](https://www.baeldung.com/maven-resources-plugin)
> The resources plugin copies files from input resource directories to an output directory. This plugin has three goals, which are different only in how the resources and output directories are specified.

The three goals of this plugin are:

> a) resources – copy resources that are part of the main source code to the main output directory.

> b) testResources – copy resources that are part of the test source code to the test output directory.

>c) copy-resources – copy arbitrary resource files to an output directory, requiring us to specify the input files and the output directory.

    mvn resources:resources
    

## [The Compiler Plugin](https://www.baeldung.com/maven-compiler-plugin)
>The compiler plugin is used to compile the source code of a Maven project. This plugin has two goals, which are already bound to specific phases of the default lifecycle:

> a) compile – compile main source files

> b) testCompile – compile test source files
    
    mvn compile 
    
    mvn test-compile
    
## [The Surefire Plugin](https://www.baeldung.com/maven-surefire-plugin)
> We can run the tests of a project using the surefire plugin. By default, this plugin generates XML reports in the directory target/surefire-reports.

>This plugin has only one goal, test. This goal is bound to the test phase of the default build lifecycle, and the command mvn test will execute it.

    mvn test
    
> The surefire plugin can work with the test frameworks JUnit and TestNG. No matter which framework we use, the behavior of surefire is the same.
  
>  By default, surefire automatically includes all test classes whose name starts with Test, or ends with Test, Tests or TestCase.
  
>  We can change this configuration using the excludes and includes parameters, however:
  ```
      <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.21.0</version>
          <configuration>
              <excludes>
                  <exclude>DataTest.java</exclude>
              </excludes>
              <includes>
                  <include>DataCheck.java</include>
              </includes>
          </configuration>
      </plugin>
  ```
  With this configuration, test cases in the DataCheck class are executed while the ones in DataTest aren’t.


