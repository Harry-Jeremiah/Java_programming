public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int number = 12;
        System.out.println(number);

        double digit = 13.9;
        System.out.println(digit);
        
        //number = digit;
        //error - type mismatch

        digit = 5.7;

        number = (int) digit;
        System.out.println("digit is " + digit);
        System.out.println("number is " + number);
        
        number = (int) 1.9;
        System.out.println("Number is " + number);

        final int num = 5;
        System.out.println("Num is " + num);

    }
}