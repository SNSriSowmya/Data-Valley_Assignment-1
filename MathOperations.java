//Create a Java class MathOperations with overloaded methods for addition (add) that can accept two
//integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the
//main method by adding two integers, three doubles, and concatenating two strings.

public class MathOperations {
    
    // add method with two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // add method with three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // add method with two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Adding two integers
        int s1 = math.add(5, 3);
        System.out.println("Sum of integers: " + s1);
        
        // Adding three doubles
        double s2 = math.add(2.5, 3.7, 1.2);
        System.out.println("Sum of doubles: " + s2);
        
        // Concatenating two strings
        String s3 = math.add("Hello ", "World");
        System.out.println("Concatenated string: " + s3);
    }
}