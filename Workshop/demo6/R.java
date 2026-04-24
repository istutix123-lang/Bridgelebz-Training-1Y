//public class R {
//}
import java.util.Scanner;

public class ArmstrongRecursion {

    // Recursive function to calculate sum of powers
    static int armstrongSum(int num, int n) {
        if (num == 0)
            return 0;

        int digit = num % 10;
        return (int)Math.pow(digit, n) + armstrongSum(num / 10, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        // Count digits
        int n = String.valueOf(num).length();

        int result = armstrongSum(num, n);

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}