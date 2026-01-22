import java.util.Scanner;
public class SpringSeason{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a month = " );
			int month=sc.nextInt();
			System.out.print("enter a day = " );
			int day=sc.nextInt();
			
			
			if( ( month == 3 && day >= 20) || (month == 4 || month == 5) || (month==6&&day<=20)){
				System.out.println(" its a spring season  " );
			
			} else   {
				System.out.println(" its not a spring season "  );
			
	}
}
}

