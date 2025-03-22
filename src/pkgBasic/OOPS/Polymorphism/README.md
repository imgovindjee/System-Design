# Polymorphism in Java

## Introduction

**Polymorphism** is one of the four fundamental principles of Object-Oriented Programming (OOP). It allows a single interface to be used for different types of objects, enabling **flexibility**, **scalability**, and **code reuse**.

Polymorphism in Java can be classified into two types:
1. **Compile-time Polymorphism (Method Overloading)**
2. **Run-time Polymorphism (Method Overriding)**

## **What is Polymorphism?**

**Polymorphism** means "many forms." It allows a method, function, or object to behave differently based on the context. Polymorphism enables **dynamic method resolution** and **method flexibility**, making applications easier to extend and maintain.

### **Key Benefits of Polymorphism**
- **Code Reusability**: Write a single interface that works for multiple types.
- **Scalability**: Add new functionalities with minimal code changes.
- **Maintainability**: Reduce complexity and improve code clarity.

---

## **1. Compile-Time Polymorphism (Method Overloading)**

Compile-time polymorphism occurs when multiple methods in the same class share the same name but have **different method signatures** (parameters). The method to be called is determined **at compile time**.

**Why Use Method Overloading?**
- Provides a cleaner and more intuitive interface.
- Reduces redundancy by using a single method name for similar operations.

---

## **2. Run-Time Polymorphism (Method Overriding)**

Run-time polymorphism occurs when a subclass provides a **specific implementation** of a method already defined in its parent class. The method to be called is determined **at runtime**.


**Why Use Method Overriding?**
- Enables **dynamic method resolution**.
- Supports **polymorphic behavior**, where one interface can be used for multiple implementations.
- Makes code **extensible** by allowing future modifications.

---

## **Using Polymorphism with Interfaces**

Polymorphism is widely used with **interfaces**, allowing multiple classes to share a common contract.

**Why Use Interfaces with Polymorphism?**
- Promotes **loose coupling**, making code more flexible.
- Allows multiple implementations of the same behavior.
- Enables **dependency injection**, improving testability.

---

## **Real-World Example: Payment System**
