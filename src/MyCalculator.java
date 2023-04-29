import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter two numbers
        System.out.println("Welcome to my Calculator Program. ");
        System.out.println("Enter the first number: ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = reader.nextInt();
        //method calling
        System.out.println("Addition : " + num1 + " add " + num2 + " equals " + add(num1, num2));
        System.out.println("Subtraction : " + num1 + " minus " + num2 + " equals " + subtract(num1, num2));
        System.out.println("Multiplication : " + num1 + " multiplied " + num2 + " equals " + multiply(num1, num2));
        System.out.println("Division : " + num1 + " divided by " + num2 + " equals " + division(num1, num2));
    }// end of main method

    static int add(int a, int b){ //create method to add two numbers
        return a + b;
    }
    static int  subtract(int a, int b){ //create method to subtract two numbers
        return a - b;
    }
    static int  multiply(int a, int b){ // create method to multiply two numbers
        return a * b;
    }
    static int  division(int a, int b){ // create method to divide two numbers
        return a / b;
    }
}
