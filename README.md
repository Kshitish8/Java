# Learning Java

Here in this repo, i will be keeping a track of things, that i have learned in Java.

## Setup

This workspace is configured for Java 26.0.1 on Windows.

Use it in VS Code like this:

1. Open this folder in VS Code.
2. Make sure the Extension Pack for Java is installed.
3. Put source files in `src`.
4. Run or debug `src/Main.java`, or use the `Build Java` task.

## Topics Learned

- **Object References vs Copies**: Java passes object references by default; use constructors to create independent copies.
- **String Operations**: Methods like `charAt()` for accessing individual characters in strings.
- **Java Syntax**: No named arguments in constructors (use positional arguments instead).
- **Arrays**: Creating and working with arrays, printing them with `Arrays.toString()`.

## Current Example

```java
import oops.Rectangle;

public class Main
{
  public static void main(String[] args) {
  Rectangle rect  = new Rectangle(3,4 );
    rect.Draw();
    rect.Area();
  }
}
```

This program demonstrates:

- Importing a class from a package with `import oops.Rectangle;`.
- Creating a `Rectangle` object using a constructor with `length` and `breadth`.
- Calling methods on an object (`Draw()` and `Area()`).
- Using the `oops` package structure for OOP examples.

## All Tasks (session history)

- **JDK verification**: Confirmed JDK `26.0.1` is installed and on `PATH`.
- **VS Code scaffolding**: Added workspace files in `.vscode/` (`settings.json`, `tasks.json`, `launch.json`) and a `bin` output folder to enable build/run from the editor.
- **Code edits to `src/Main.java`**: Iteratively updated the file to demonstrate several small examples:
  - Fixed invalid named-argument syntax and used positional constructor arguments instead.

## OOPS (Object-Oriented Programming) Implementation

### Overview

Implemented inheritance-based shape hierarchy with a base `Shape` class and two subclasses: `Circle` and `Rectangle`. Both subclasses override the `Draw()` and `Area()` methods.

### Classes Created

#### Shape.java (Base Class)

- Provides abstract methods: `Draw()` and `Area()`
- Serves as the parent class for all shapes

#### Circle.java (Subclass)

- Extends `Shape`
- Properties: `radius` (static field)
- Overrides `Draw()`: Prints "Drawing a circle"
- Overrides `Area()`: Calculates and prints the area using π * r²

#### Rectangle.java (Subclass)

- Extends `Shape`
- Properties: `length` and `breadth` (instance fields)
- Constructor: Initializes length and breadth
- Overrides `Draw()`: Prints "Drawing a rectangle"
- Overrides `Area()`: Calculates and prints the area as length × breadth
- Static initializer block: Prints initialization message

#### Main.java

- Demonstrates polymorphism by creating instances of both `Rectangle` and `Circle`
- Uses the `Shape` interface to work with objects of different types
- Creates `Rectangle(3, 4)` → Area: 12
- Creates `Circle(5)` → Area: 78 (approximately)

### Issues Fixed

1. **Class Declaration Errors**: Fixed malformed class declarations that were missing class names
2. **Method Visibility**: Converted static methods to instance methods for proper inheritance
3. **Import Issues**: Corrected imports to use custom `oops.Shape` instead of `java.awt.Shape`
4. **Static Method Calls**: Changed from calling methods on the class to calling them on instances

### Key Concepts Demonstrated

- **Inheritance**: Using `extends` to inherit from a parent class
- **Method Overriding**: Subclasses override parent methods with their own implementations
- **Polymorphism**: Working with objects through their parent class type
- **Package Organization**: Using the `oops` package to organize OOP-related classes
