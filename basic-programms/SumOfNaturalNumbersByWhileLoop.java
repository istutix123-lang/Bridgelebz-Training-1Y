import java.util.Scanner;

public class SumOfNaturalNumbersByWhileLoop{
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }

            // Using formula n*(n+1)/2
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop     = " + sum);
            System.out.println("Sum using formula        = " + sumFormula);
            if (sum == sumFormula) {
                System.out.println("Result: Both computations are CORRECT.");
            } else {
                System.out.println("Result: Computations are NOT matching.");
            }
        }
    }
}
