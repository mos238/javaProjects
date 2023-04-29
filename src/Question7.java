public class Question7 { // Create a checkAge() method with an integer variable called age
    static void	CheckAge(int age) {
       if  (age	< 18) {// If age is less than 18, print "Access denied"
                System.out.println("Access denied");
 	 } 	else	{// If age is greater than, or equal to, 18, print "Access granted"
            System.out.println("Access granted");
        }
    } // end of method
    public static void main(String[] args) {
        // Call the checkAge method and pass along an age of 20
       CheckAge(10);
       CheckAge(2);
       CheckAge(24);
       CheckAge(18);
    }
}
