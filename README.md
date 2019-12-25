![Code Status](https://img.shields.io/badge/status-obsolete-critical)

[![Replacement](https://img.shields.io/static/v1?label=replacement&message=icm-bits-java&color=green)](https://github.com/ayeseeem/icm-bits-java)

This code is **OBSOLETE**.
You should use
[ayeseeem/icm-bits-java](https://github.com/ayeseeem/icm-bits-java)
instead, which is the same code, but with extra features and in different Java packages.
This repository is liable to be deleted.

The name **`jtest`** made it look as though this was related to
[Parasoft](https://www.parasoft.com/)'s
[Jtest](https://www.parasoft.com/products/jtest).


`icm-jtest`
===========

[![Build Status](https://travis-ci.org/ayeseeem/icm-jtest.svg?branch=master)](https://travis-ci.org/ayeseeem/icm-jtest)

Java test utilities from [ayeseeem.org](https://www.ayeseeem.org/).

`@ContainedItem` for better `if`s
---------------------------------

Allows clearer, more expressive `if` statements testing whether an item is in a
group of items. Which of these do you prefer? Which expresses more clearly
and directly what is being asked?:

```java
if (the(month).isOneOf(SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER) {
    // it's name derives from its Latin ordinal in the Roman calendar
}

if (Arrays.asList(SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER).contains(month)) {
    // ...
}
```

```java
if (the(month).isIn(myFavouriteMonths) {
    // ...
}

if (myFavouriteMonths.contains(month)) {
    // ...
}
```

Works for a `Collection`, an array of objects, or individual items listed
directly (using varargs).
See
[`ContainedItem.java`](https://github.com/ayeseeem/icm-jtest/blob/master/src/main/java/org/ayeseeem/jtest/ContainedItem.java)
and
[`ContainedItemExamplesTest.java`](https://github.com/ayeseeem/icm-jtest/blob/master/src/test/java/org/ayeseeem/jtest/example/ContainedItemExamplesTest.java)
for more details.


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
