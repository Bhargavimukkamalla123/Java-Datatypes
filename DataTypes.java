📄 Example 1:
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



