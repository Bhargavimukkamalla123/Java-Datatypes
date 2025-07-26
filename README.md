# Java Data Types

This is my first Java GitHub repository.  
It introduces basic data types in Java with examples and outputs.

---

## 📌 What is a Data Type?

A **data type** specifies the type of data that a variable can hold.  
It determines the **size** and **range** of values that can be stored in that variable.

> 👉 Java is a **statically-typed** language, meaning every variable must be declared with a specific data type before it can be used.

---

## 🧠 Java Data Types – Complete Classification

Java has **two main categories** of data types:

---

### ✅ 1. Primitive Data Types  
These are built into the Java language — used to store simple values.

There are **8 primitive types**, divided into 4 groups:

| Category        | Data Type | Size            | Example             |
|----------------|-----------|------------------|---------------------|
| Integer         | `byte`    | 1 byte (8 bits)  | `byte a = 10;`      |
|                 | `short`   | 2 bytes          | `short b = 200;`    |
|                 | `int`     | 4 bytes          | `int c = 1000;`     |
|                 | `long`    | 8 bytes          | `long d = 100000L;` |
| Floating Point  | `float`   | 4 bytes          | `float e = 5.75f;`  |
|                 | `double`  | 8 bytes          | `double f = 99.99;` |
| Character       | `char`    | 2 bytes          | `char g = 'A';`     |
| Boolean         | `boolean` | 1 bit (logical)  | `boolean h = true;` |

---

### ✅ 2. Non-Primitive (Reference/Object) Data Types  
These refer to objects and are either created by the programmer or provided by Java.

| Type       | Example                          |
|------------|----------------------------------|
| `String`   | `String name = "Bhargavi";`      |
| Arrays     | `int[] arr = {1, 2, 3};`         |
| Classes    | `Student s = new Student();`     |
| Interfaces | `Runnable r = new MyRunnable();` |

---

## 📄 Example 1 – Data Types Declaration

### 🔹 **Source Code**
```java
public class DataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 50;
        int i = 150;
        long l = 1000000L;
        float f = 5.6f;
        double d = 45.3333333;
        char ch = 'A';
        boolean bool = true;
        String str = "Bhargavi";

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
    }
}
💻 Output:
byte: 10
short: 50
int: 150
long: 1000000
float: 5.6
double: 45.3333333
char: A
boolean: true
String: Bhargavi

📄 Example 2 – Default Values of Data Types
🔹 Source Code
public class DefaultValues {
    // Instance variables (get default values)
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;

    void printDefaults() {
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: '" + c + "'");
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.printDefaults();
    }
}
💻 Output:
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char: ''
boolean: false
String: null

▶️ Run These Programs
You can copy and run these programs using:

OnlineGDB Java Compiler

Any Java IDE like IntelliJ, Eclipse, BlueJ, or VS Code.

## 🙋 Author
**Bhargavi Mukkamalla**  
This is part of my Java learning journey.

