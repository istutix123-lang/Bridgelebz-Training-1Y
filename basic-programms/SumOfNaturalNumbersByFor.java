import java.util.Scanner;

public class SumOfNaturalNumbersByFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =sc.nextInt();
        if (n <= 0) {
            System.out.println(" NOT a natural number.");
        } 
        else {
            int sumFormula = n * (n + 1) / 2;
            int sum = 0;
            for (int i = 1;i <= n;i++){
                sum=sum + i;
            }
            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using for loop = " + sum);
            // Compare results
            if (sumFormula == sum) {
                System.out.println("Both results are SAME.");
            } else {
                System.out.println("Results are DIFFERENT.");
            }
        }
    }
}
