public class Operators2{
public static void main(String[] args){
	int i=0;
	
System.out.println("val;" + i);
i++;
System.out.println("vala;" + i++);
System.out.println("valb;" + i);
++i;
System.out.println("valc;" + i++);
System.out.println("vald;" + i++);
//int z= i+ i++ + ++i + i++ + i + i++;
int z=i - i++ - --i + i - ++i + i++;
System.out.println(z);
int y=i + i++ + ++i + i++ + i + i++;
System.out.println(y);
for (int x=0;x<10;x++){
System.out.println("x:"+x);
}
int j=10;
while (j>0){
	System.out.println("j:"+j);
	j--;
}
int k=10;
do{
		System.out.println("k:"+k);
		k--;
}while (k>0);
}
}


	





