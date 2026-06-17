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

**Shape.java** (Base Class)
- Provides abstract methods: `Draw()` and `Area()`
- Serves as the parent class for all shapes

**Circle.java** (Subclass)
- Extends `Shape`
- Properties: `radius` (static field)
- Overrides `Draw()`: Prints "Drawing a circle"
- Overrides `Area()`: Calculates and prints the area using π * r²

**Rectangle.java** (Subclass)
- Extends `Shape`
- Properties: `length` and `breadth` (instance fields)
- Constructor: Initializes length and breadth
- Overrides `Draw()`: Prints "Drawing a rectangle"
- Overrides `Area()`: Calculates and prints the area as length × breadth
- Static initializer block: Prints initialization message

**Main.java**
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
  - Demonstrated object reference vs copy using `java.awt.Point` and creating a copy with `new Point(a)`.
  - Explored `String` methods (e.g., `charAt()`).
  - Created and printed arrays using `Arrays.toString()`.
  - Sorted an array using `Arrays.sort()` and showed a multidimensional array sample.
  - Added a basic arithmetic example and highlighted divide-by-zero behavior (`ArithmeticException`).
- **Validation**: Compiled and ran the examples locally to confirm outputs and behavior.
- **README synchronization**: Updated this `README.md` multiple times to reflect the current `src/Main.java` contents and learning notes.

If you want these tasks split into separate example files or organized under an `examples/` folder, I can do that next.

## Recent Main.java Tasks

- Implemented several short demos in `src/Main.java` during this session, most recently:
  - **OOP package + Rectangle**: Created `src/oops/Rectangle.java` with `package oops;`, a constructor, and methods to draw a rectangle and calculate its area.
  - **Package import in Main**: Updated `src/Main.java` to import `oops.Rectangle`, create a `Rectangle` object, and call `Draw()` and `Area()`.
  - **Boolean negation**: Declared a `boolean isPassed = false;` and printed `!isPassed` to show logical NOT.
  - **Scanner input**: Read a name from the console and printed a greeting.
  - **Newton_Second_Law fix**: Corrected `src/Newton_Second_Law.java` by renaming the class to match the file (`Newton_Second_Law`), declaring input variables (`double u, v, t, a`), and closing the `Scanner`. Calculated displacement with `u * t + 0.5 * a * t * t` and verified compilation.
  - **Math.random**: Generated a random `double` and scaled it to a usable range.
  - **Math class methods**: Used `Math.max`, `Math.min`, `Math.round`, `Math.floor`, `Math.ceil`, and `Math.sqrt`.
  - **Random integer generation**: Scaled `Math.random()` to generate random integers in a specific range with the formula `(int)(Math.random() * (max - min + 1)) + min`.
  - Previously explored: object reference vs copy (`Point`), `String.charAt()`, array creation/sorting and printing with `Arrays.toString()`, basic arithmetic (including divide-by-zero), and other `Math` class operations.

These examples were compiled and run locally to verify behavior.
