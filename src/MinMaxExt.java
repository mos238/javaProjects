import java.util.Scanner;
public class MinMaxExt {
    //main methods
    public static void main(String[] args) {
        //create scanner object
        Scanner reader = new Scanner(System.in);
        //read user input num1, num2,num3
        System.out.println("This program will read three numbers from you. ");
        System.out.println("Enter 3 numbers: ");

        //read user input as double
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double num3 = reader.nextDouble();

        if (num1 %1 == 0 && num2%1==0 && num3%1==0){// these are the whole numbers
            System.out.println("The biggest number is " + maxNumber((int)num1,(int)num2, (int)num3));
            System.out.println("The smallest number is " + minNumber((int)num1, (int)num2, (int)num3));
        }else{//decimal numbers , double method call
            System.out.println("The biggest number is " + maxNumber(num1,num2, num3));
            System.out.println("The smallest number is " + minNumber(num1, num2, num3));

        }
        //call max number

    }
    // methods to find the biggest number

    // method 3 overloading

    static int maxNumber (int a, int b, int c){
        if (a > b && a > c) { // do if else statement
            return a; // a is the biggest
        } else if (b > a && b >c){
            return b;// b is the biggest
        }else {
            return c; //c is the biggest
        }// end of maxNumber method
    }

    static int minNumber (int a, int b, int c){

        if (a < b && a < c) { // do if else statement
            return a; // a is the biggest
        } else if (b < a && b <c){
            return b;// b is the biggest
        }else {
            return c; //c is the biggest
        }// end of maxNumber method

    }// end of maxNumber method

    static double maxNumber (double a, double b, double c){
        if (a > b && a > c) { // do if else statement
            return a; // a is the biggest
        } else if (b > a && b >c){
            return b;// b is the biggest
        }else {
            return c; //c is the biggest
        }// end of maxNumber method
    }
    static double minNumber (double a, double b, double c){

        if (a < b && a < c) { // do if else statement
            return a; // a is the biggest
        } else if (b < a && b <c){
            return b;// b is the biggest
        }else {
            return c; //c is the biggest
        }// end of maxNumber method

    }// end of maxNumber method
}

