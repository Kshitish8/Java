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
import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);
  }
}
```

This program demonstrates:

- Reading input from the user with `Scanner`.
- Using `nextLine()` to capture a full line of text.
- Printing a greeting that includes the entered name.

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
  - **Scanner input**: Read a name from the console and printed a greeting.
  - **Newton_Second_Law fix**: Corrected `src/Newton_Second_Law.java` by renaming the class to match the file (`Newton_Second_Law`), declaring input variables (`double u, v, t, a`), and closing the `Scanner`. Calculated displacement with `u * t + 0.5 * a * t * t` and verified compilation.
  - **Math.random**: Generated a random `double` and scaled it to a usable range.
  - **Math class methods**: Used `Math.max`, `Math.min`, `Math.round`, `Math.floor`, `Math.ceil`, and `Math.sqrt`.
  - **Random integer generation**: Scaled `Math.random()` to generate random integers in a specific range with the formula `(int)(Math.random() * (max - min + 1)) + min`.
  - Previously explored: object reference vs copy (`Point`), `String.charAt()`, array creation/sorting and printing with `Arrays.toString()`, basic arithmetic (including divide-by-zero), and other `Math` class operations.

These examples were compiled and run locally to verify behavior.
