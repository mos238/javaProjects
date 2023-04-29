public class MethodParameter {
    // own method starts
    static void welcome(String fName, int prize){
        System.out.println("Congratulations you've won " + fName + "Hudini, prize " + prize);
    }
    // main method
    public static void main(String[] args) {
        welcome("Bob ", 1); // passing argument
        welcome("Jane ", 2);
        welcome("Salma ", 3);
    }
}
