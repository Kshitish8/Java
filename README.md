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
public class Main {

    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random * 100);
    }
}
```

This program demonstrates:

- Using `Math.random()` to generate a random `double` between 0.0 (inclusive) and 1.0 (exclusive).
- Scaling the random value by multiplying it by 100 to get a result in the range [0, 100).

## All Tasks (session history)

- **JDK verification**: Confirmed JDK `26.0.1` is installed and on `PATH`.
- **VS Code scaffolding**: Added workspace files in `.vscode/` (`settings.json`, `tasks.json`, `launch.json`) and a `bin` output folder to enable build/run from the editor.
- **Code edits to `src/Main.java`**: Iteratively updated the file to demonstrate several small examples:
  - Fixed invalid named-argument syntax and used positional constructor arguments instead.
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
  - **Math.random**: Generated a random `double` and scaled it to a usable range.
  - **Math class methods**: Used `Math.max`, `Math.min`, `Math.round`, `Math.floor`, `Math.ceil`, and `Math.sqrt`.
  - **Random integer generation**: Scaled `Math.random()` to generate random integers in a specific range with the formula `(int)(Math.random() * (max - min + 1)) + min`.
  - Previously explored: object reference vs copy (`Point`), `String.charAt()`, array creation/sorting and printing with `Arrays.toString()`, basic arithmetic (including divide-by-zero), and other `Math` class operations.

These examples were compiled and run locally to verify behavior.
