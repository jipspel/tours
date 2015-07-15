# Tours

![Tours](http://i.imgur.com/jideETQ.png)
[Designed by Freepik](http://www.freepik.com), modified by [Twan Coenraad](https://github.com/tcoenraad)

An imperative language for compiler construction. Compiles to Java bytecode.

[![Build Status](https://travis-ci.org/jipspel/tours.svg?branch=master)](https://travis-ci.org/jipspel/tours)
[![codecov.io](http://codecov.io/github/jipspel/tours/coverage.svg?branch=master)](http://codecov.io/github/jipspel/tours?branch=master)

Prerequisites
=============

* Install [Gradle](https://docs.gradle.org/current/userguide/installation.html) `~> 2.5`

Usage
=====

* Generate *Java bytecode* from *Tours* file:
  * `gradle generate -Psrc filename`
* Generate *Java bytecode* from *Tours* file and save *Java class* file:
  * `gradle generateAndSave -Psrc filename -Pdir directory`
* Execute *Tours* file:
  * `gradle execute -Psrc filename`
