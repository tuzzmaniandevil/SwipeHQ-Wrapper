# SwipeHQ-Wrapper [![Build Status](https://travis-ci.org/tuzzmaniandevil/SwipeHQ-Wrapper.svg?branch=master)](https://travis-ci.org/tuzzmaniandevil/SwipeHQ-Wrapper)
a lightweight Java wrapper for the [SwipeHQ](https://www.swipehq.co.nz/) API

# Table of contents
- [Using this with Maven](#using-this-with-maven)

## Using this with Maven
This package is available in the JCenter repository, Here are the details to use it:

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>central</id>
        <name>bintray</name>
        <url>http://jcenter.bintray.com</url>
    </repository>
</repositories>
```

And adding this dependency:

```xml
<dependency>
    <groupId>co.tuzza</groupId>
    <artifactId>swipehq</artifactId>
    <version>1.6</version>
</dependency>
```