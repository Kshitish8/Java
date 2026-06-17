# Learning Java

Here in this repo, I will be keeping track of the things that I have learned in Java.

## Setup

This workspace is configured for Java 26.0.1 on Windows.

Use it in VS Code like this:

1. Open this folder in VS Code.
2. Make sure the Extension Pack for Java is installed.
3. Put source files in `src`.
4. Run or debug `src/Main.java`, or use the `Build Java` task.

---

## Topics Learned

- **Object References vs Copies**: Java passes object references by default; use constructors to create independent copies.
- **String Operations**: Methods like `charAt()` for accessing individual characters in strings.
- **Java Syntax**: No named arguments in constructors (use positional arguments instead).
- **Arrays**: Creating and working with arrays, printing them with `Arrays.toString()`.
- **Inheritance**: Creating subclasses using the `extends` keyword.
- **Method Overriding**: Allowing subclasses to provide their own implementation of inherited methods.
- **Polymorphism**: Using a parent class reference to refer to child class objects.

---

## Current Example

```java
import oops.Rectangle;

public class Main
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        rect.Draw();
        rect.Area();
    }
}
```

This program demonstrates:

- Importing a class from a package using `import oops.Rectangle;`
- Creating a `Rectangle` object using its constructor.
- Calling object methods (`Draw()` and `Area()`).
- Using the `oops` package structure for OOP examples.

---

## All Tasks (Session History)

- **JDK verification**: Confirmed JDK `26.0.1` is installed and on `PATH`.
- **VS Code setup**: Added workspace files in `.vscode/` (`settings.json`, `tasks.json`, `launch.json`) and configured the `bin` output folder.
- **Code updates**:
  - Fixed invalid named-argument syntax.
  - Used positional constructor arguments.
  - Added inheritance examples.
  - Added method overriding examples.
  - Added polymorphism examples.

---

# OOPS (Object-Oriented Programming)

## Overview

Implemented an inheritance-based shape hierarchy with a base `Shape` class and two subclasses: `Circle` and `Rectangle`.

Both subclasses override the `Draw()` and `Area()` methods to provide their own implementation.

---

## Classes Created

### Shape.java (Base Class)

- Parent class for all shapes.
- Provides default implementations of:
  - `Draw()`
  - `Area()`

---

### Circle.java

- Extends `Shape`
- Property:
  - `radius`
- Overrides:
  - `Draw()`
  - `Area()`
- Calculates area using:

```
π × r²
```

---

### Rectangle.java

- Extends `Shape`
- Properties:
  - `length`
  - `breadth`
- Constructor initializes both values.
- Overrides:
  - `Draw()`
  - `Area()`
- Calculates area using:

```
length × breadth
```

- Includes a static initializer block.

---

## Polymorphism Example

One of the latest additions to this repository is a **runtime polymorphism** example.

Example:

```java
Shape s1 = new Rectangle(3, 4);
Shape s2 = new Circle(5);

s1.Draw();
s1.Area();

s2.Draw();
s2.Area();
```

### What this demonstrates

- A parent class (`Shape`) reference can point to different child class objects.
- The method that gets executed depends on the **actual object**, not the reference type.
- Java decides which overridden method to call at **runtime** (Dynamic Method Dispatch).

Output will be similar to:

```
Drawing a rectangle
Area = 12

Drawing a circle
Area = 78.5
```

This is one of the core concepts of Object-Oriented Programming and makes Java code more flexible and extensible.

---

## Issues Fixed

1. Fixed malformed class declarations.
2. Converted static methods to instance methods for proper inheritance.
3. Corrected imports to use the custom `oops.Shape`.
4. Changed method calls from class methods to object methods.
5. Added runtime polymorphism using parent class references.

---

## Key Concepts Demonstrated

- Object Creation
- Constructors
- Packages
- Classes & Objects
- Inheritance (`extends`)
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Package Organization