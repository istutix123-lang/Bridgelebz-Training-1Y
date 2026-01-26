 import java.util.Scanner;
public class PrintEvenOrOdd1ToN{
public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	
				System.out.print("enter a value :- ");

				int c= sc.nextInt();
	if (c<=0){
						System.out.print(" entered number  is not a natural no ");
	}else{
	
		
	for (int i=1;i<=c;i++)
	{
		if (i % 2 == 0)
		{
		System.out.println("even no.is :- " + i);
		}
		else if ( i % 2 != 0)
		{
					System.out.println("odd no.is :- " + i);

	}
	}
				}
				}
}
			