public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x = 1;

        int y = x++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 1;
        int b = --a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int m = 1;
        System.out.println(m++);
        System.out.println("m = " + m);

        int e = 6;
        int f = 8;

        int prod = e*=f;
        System.out.println("product is " + prod);
    }
}
