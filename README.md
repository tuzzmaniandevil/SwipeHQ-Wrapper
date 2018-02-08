# SwipeHQ-Wrapper [![Build Status](https://travis-ci.org/tuzzmaniandevil/SwipeHQ-Wrapper.svg?branch=master)](https://travis-ci.org/tuzzmaniandevil/SwipeHQ-Wrapper)
a lightweight Java wrapper for the [SwipeHQ](https://www.swipehq.co.nz/) API

# Table of contents
- [Using Maven](#using-maven)

## SwipeHQ Developer Documentation
* [SwipeHQ Developer Documentation](https://merchant.swipehq.com/admin/main/index.php?module=developers&action=index)
  * [Live Payment Notification (LPN)](https://merchant.swipehq.com/admin/main/index.php?module=developers&action=lpn)

**Note: To be able to access the  you require an account.**

## Using Maven
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