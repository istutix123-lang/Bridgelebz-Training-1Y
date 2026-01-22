import java.util.Scanner;
public class NaturalNoAndSum{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number = " );
			int a=sc.nextInt();
			int sum=a*(a+1)/2;
			if (a>0){
				System.out.println("The sum of " + a + " natural number is " + sum );
			} else {
				System.out.println("The number " + a + " is not a natural number" );
			}
	}
}
