// 1. Basic Program (Hello World)

// In C#, we use static void Main() to define the entry point of the application.
// In Java, the entry point is also the main method but the syntax slightly differs: 
// public static void main(String[] args) in Java vs. static void Main() in C#.

public class Main {
    public static void main(String[] args) {
        // Both in C# and Java, we use System.out.println() for output. 
        // In C#, it would be Console.WriteLine("Hello, World!");

        System.out.println("Hello, World!");  // Prints to the console
    }
}
--------------------------------------------------------------------_---------_----
// 2. Variable Declaration

// C#: int number = 5;
// Java: int number = 5;

public class VariablesExample {
    public static void main(String[] args) {
        int number = 5;  // Declaring and initializing a variable in Java

        // In C# we also declare and initialize the variable in a similar manner.
        // C#: int number = 5;
        System.out.println("Number: " + number);
    }
}
--------------------------------------------------------------------
// 3. If-Else Statement

// In both Java and C#, the syntax of the if-else statement is very similar:

public class IfElseExample {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {  // The condition in both Java and C# is the same
            // In both languages, curly braces are used for the block of code executed if the condition is true
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}
--------------------------------
// 4. For Loop

// Both C# and Java use similar syntax for loops:

public class ForLoopExample {
    public static void main(String[] args) {
        // In both Java and C#, the basic for loop is the same:
        // for (initialization; condition; increment)
        
        for (int i = 0; i < 5; i++) {  // Loop structure in both Java and C#
            System.out.println("i = " + i);  // Print value of i
        }
    }
}
--------------------------------
// 5. Class and Object

// C#: class Person { public string name; }
// Java: class Person { String name; } 

class Person {
    // Java uses a type declaration followed by the variable name
    String name;  // Field of the class

    // Constructor - both in Java and C# constructors are used for object initialization
    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        // Both languages use methods with return type and parameters
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        // In both C# and Java, you create objects using the 'new' keyword
        Person person = new Person("John");
        person.greet();  // Call the method
    }
}
--------------------------------
// 6. Arrays

// Both C# and Java arrays are declared and used in a similar way.

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Java array declaration (similar to C#)

        // Looping through the array - syntax is similar in both languages
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }
    }
}
--------------------------------
// 7. Functions/Methods

// C#: public int AddNumbers(int a, int b) { return a + b; }
// Java: public int addNumbers(int a, int b) { return a + b; }

public class MethodsExample {
    public static void main(String[] args) {
        MethodsExample example = new MethodsExample();
        int result = example.addNumbers(5, 10);  // Calling method from main
        System.out.println("Sum: " + result);  // Printing the result
    }

    // Method definition in Java, similar to C#
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
--------------------------------
// 8. Inheritance

// Inheritance in Java is similar to C#. In both, you use the 'extends' keyword in Java and 'class' in C#.

class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {  // Inheritance: Dog is a subclass of Animal
    public void sound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // In both C# and Java, we can create objects of the subclass
        Dog dog = new Dog();
        dog.sound();  // Calling overridden method from Dog class
    }
}
--------------------------------
// 9. Exception Handling

// C#: try { } catch { }
// Java: try { } catch { }

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());  // In both, exception is handled similarly
        }
    }
}

-----------------------------------------
