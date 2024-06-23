Today's Agenda
==============
   09:00 - 10:00 - Control statements
   10:00 - 10:30 - Classroom + Break
   10:30 - 11:40 - Methods and object
   11:40 - 12:10 - Classroom + Break
   12:10 - 12:40 - Arrays
   12:40 - 01:00 - Classroom
   After 01:00   - Live quiz and Recap












**Control and Jump Statements:**

*Definition:* 
   Control statements in Java are used to manage the flow of execution in a program. They include decision-making statements

*Looping Statements:*
    For Loop: Repeats a block of code a specific number of times.

*Jump Statements:*
    Break Statement: Terminates the innermost loop or switch statement. Continue Statement: Skips the current iteration and continues to the loop and proceeds to the next iteration.

**Methods:**

*Definition:* 
   A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined using the def keyword, followed by the method's signature, which includes its name, parameters, and return type.

Explanation: 
   Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.

**Objects:**

*Definition:*
    In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.

Explanation
   Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.



**Steps to execute in Debug mode:**

    1. Set a break Point(double tap/click on the blue line will add/remove break point )
            -shortcut key --> ctrl+shift+b
    2. Right click --> Debug as --> Java Application
    3. Click on the Swtich button for Debug presptive
    4. Click on Resume icon or use f8 key
            - it will go to the next break point





**Method Signature**
      Access modifier returntype  methodName(input arguments){}



**Access Modifier**
   1. public - Able to access anywhere
   2. private - able to access in that particular class alone
   3. default - able to access in that package alone 
   4. protected - able to access in same package and than different package with inheritance.


   1.Create a method within a class and outside the main method/ normal method.
   2. nested is method not in possible in java.
   3. Able to create a method in any order.


   Default values for dataTypes
   ----------------------------
      byte,short, int,long = 0
      float and double = 0.0
      boolean = false
      char = null
      String = null


      Gobal variables vs Local varibales
      gobal -> blue color
      local -> brown color

      gobal --> able to access anywhere
      local --> able to access in that particular method alone.


### Arrays:
1. **Definition:**
   An array in Java is a data structure that stores a fixed-size, ordered collection of elements of the same data type. Arrays provide a convenient way to group related data items under a single name. The elements in an array are accessed using an index, starting from 0. Arrays are useful for efficiently managing and manipulating large sets of data.

2. **Explanation:**
  *Declaration:*
    Arrays are declared with a type, followed by square brackets ([]).
    Example: int[] numbers;
  *Initialization:*
    Arrays can be initialized when declared or later using the new keyword.
    Example: int[] numbers = new int[5];
  *Accessing Elements:*
   Elements in an array are accessed using their index (starting from 0).
   Example: int firstNumber = numbers[0];
  *Length of Array:*
   The length of an array is obtained using the length attribute.
   Example: int arrayLength = numbers.length;



