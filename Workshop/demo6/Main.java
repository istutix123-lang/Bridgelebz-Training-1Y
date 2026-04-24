//public class rec{
    //public static void main(String[] args){

  //  }
//}
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int result = 0;

        // Count digits
        int n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}