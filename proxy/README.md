# Proxy Design Pattern

## Overview

The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. This pattern comes under the structural design patterns and is used to create a representative object that controls access to another object, which may be remote, expensive to create, or in need of securing.

## Intent

The main intent of the Proxy Design Pattern is to control access to an object by acting as a wrapper. It adds a level of indirection when accessing the object, allowing for various additional operations such as lazy loading, access control, logging, etc.

## Structure

The Proxy Design Pattern typically involves the following components:

- **Subject:** This is the interface or abstract class defining the common interface for the `RealSubject` and `Proxy` so that a `Proxy` can be used anywhere a `RealSubject` is expected.

- **RealSubject:** This is the real object that the proxy represents. It implements the `Subject` interface, and the proxy controls access to it.

- **Proxy:** This is the class that acts as a surrogate for the `RealSubject`. It has a reference to the `RealSubject` and controls access to it.


## Example 

this repository implement two examples 

1. [Image Proxy](./Image_Proxy/)
2. [Exam proxy](./Exam_Proxy/)