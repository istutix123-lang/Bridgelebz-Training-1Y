import java.util.Scanner;
public class  CalculateSimpleInterest{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("principal =");
	int principal =sc.nextInt();
	System.out.print("rate =");
	double rate =sc.nextDouble();
	System.out.print("time =");
	int time =sc.nextInt();
	double SimpleInterest =(principal*rate*time)/100;
	System.out.println("Simple Interest= " + SimpleInterest);
	}
	} 














	
	
	
	
	
	
	
	