import java.math.BigInteger;
public class testJava {
    // main method ,pass on how many sequences we need to compute 100th number of fibonacci series
    public static void main(String[] args) {
        fibonacci(100); // set counter to n (whatever number) i.e. to produce the 100th number
    }
    // this is my method
    public static void fibonacci (int counter) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger  num2 = BigInteger.valueOf(1);
        BigInteger  nextNum = BigInteger.valueOf(0);
        System.out.println(num1);
        System.out.println(num2);

        // for loop
        for (int i=1; i < counter; i++){
            nextNum = num1.add(num2);
            System.out.println(nextNum);

            num1 = num2;
            num2 = nextNum;

        }
    }
}