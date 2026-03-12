public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        int iModulus = 22 % 5;

        System.out.println("The remainder is " + iModulus);

        double dModulus = 22 % 5;
        System.out.println("The remainder is " + dModulus);

        int iDivide = 22 / 5;
        System.out.println("The quotient is " + iDivide);

        double dDivide = 22 / 5;
        System.out.println("The quotient is " + dDivide);

        double dDivision = 22.0 / 5;
        System.out.println("The quotient is " + dDivision);

        double cDivision = (double) 22 / 5;    //(double) 22 - typecasting is done 
        System.out.println("The quotient is " + cDivision);

        int total = 12 + 12;
        System.out.println(total);

        int sum = (12 + 12) / 2;
        System.out.println(sum);

    }
}
