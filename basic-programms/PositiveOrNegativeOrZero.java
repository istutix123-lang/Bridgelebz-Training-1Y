import java.util.Scanner;
public class PositiveOrNegativeOrZero{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number = " );
			int a=sc.nextInt();
			if (a>0){
				System.out.println(" number is positive " );
			} else if (a < 0) {
				System.out.println(" number is negative "  );
			} else   {
				System.out.println(" number is zero "  );
			
	}
}
}

