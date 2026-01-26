import java.util.Scanner;
public class FactorialWhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a=sc.nextInt();
        if (a < 0) {
            System.out.println(" enter only a positive integer.");
        }else {
            int factorial=1;
            int i=1;
            while (i <= a) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + a + " is = " + factorial);
        }
}
}

