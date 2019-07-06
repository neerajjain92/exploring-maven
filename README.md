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
    
    => mvn compile 
    
    => mvn test-compile
    
