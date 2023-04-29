public class NameOverloading {
    // my method
    static void myMethod (String firstName) {
        System.out.println(firstName + " Bond");
    }

    // overload the method, accepts 3 parameters

    static void myMethod (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
    static void myMethod (String firstName, String middleName, String lastName) {
        System.out.println(firstName + middleName + lastName );
    }
    // main method
    public static void main(String[] args) {
        myMethod("James");
        myMethod("Piper");
        myMethod("Jaws");

        myMethod("Donald", "Duck");

        myMethod("Mohamed", " Omar", " Sayed");
    }
}
