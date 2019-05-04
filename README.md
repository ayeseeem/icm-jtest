`icm-jtest`
===========

[![Build Status](https://travis-ci.org/ayeseeem/icm-jtest.svg?branch=master)](https://travis-ci.org/ayeseeem/icm-jtest)

Java test utilities from [ayeseeem.org](https://www.ayeseeem.org/).

`@Characterization` annotation for JUnit `@Test`s
-------------------------------------------------

Marks unit tests (whole test classes, or individual test methods) as
characterization tests. That is, tests that *characterize* (capture,
or describe, or document) the behaviour of the code, but without necessarily
*specifying* the behaviour. For example,

```java
 @Characterization
 @Test
 public void testDefaultResponseIsNull() {
     // ...
 }
```

See
[`Characterization.java`](https://github.com/ayeseeem/icm-jtest/blob/master/src/main/java/org/ayeseeem/jtest/Characterization.java) for more details.
