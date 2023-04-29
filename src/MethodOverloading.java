public class MethodOverloading {
    //use return keyword inside our own method
    static int add(int x, int y){
        return  x+y;
    }
    static double add(double x, double y){
        return  x+y;
    }

    // main method
    public static void main(String[] args) {
        //method call MUST inside printlin
        System.out.println( add(10,23)); // output 33
        System.out.println(add(10.9,23.2)); // 34.1


    }
}