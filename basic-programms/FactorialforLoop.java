import java.util.Scanner;
public class FactorialforLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a=sc.nextInt();
		
        if (a < 0) {
            System.out.println(" enter only a positive integer.");
        }else {
	 int factorial=1;
		for (int i=1;i<=a;i++){
		factorial = factorial * i;
        }
			   System.out.println("Factorial of " + a + " is = " + factorial);
}
}
}

