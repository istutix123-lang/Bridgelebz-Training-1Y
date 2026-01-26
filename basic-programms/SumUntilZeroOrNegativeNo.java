import java.util.Scanner;

public class SumUntilZeroOrNegativeNo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;

        while (true) { 
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            if (a <= 0) {
                break;
            }

            sum = sum + a ;
        }

        System.out.println("Sum = " + sum);
       // sc.close();
    }
}
