//public class ftyhy {
//}
import java.util.Scanner;

public class ArmstrongTail {

    // Tail recursive function
    static int armstrongTail(int num, int n, int sum) {
        if (num == 0)
            return sum;

        int digit = num % 10;
        return armstrongTail(num / 10, n, sum + (int)Math.pow(digit, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        // Count digits
        int n = String.valueOf(num).length();

        int result = armstrongTail(num, n, 0);

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}
