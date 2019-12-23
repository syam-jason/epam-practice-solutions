 import java.util.*;
 

public class Main1

{
	
public static void main(String[] args)
	
{
		
Scanner sc=new Scanner(System.in);
		
int a[]=new int[10];
		
int sum=0;
		
int len=a.length;
		
for(int i=0;i<10;i++)
		
{
		    
a[i]=sc.nextInt();
		  
sum=sum+a[i];
		
}
		
System.out.println("The Sum of array is :"+sum);
		
System.out.println("The Average of the array is :"+(sum/len));
	
}
s
}
