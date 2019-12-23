import java.util.*;

Class Main3
{
public static void main(String[]args)
{
	public static void main(String[] args)
	{
	int a[] =new int[10];
int i,flag=0;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the element to search");
int search=sc.nextInt();
for(i=0;i<10;i++)
{
if(a[i]==search)
{
System.out.println(""+i);
flag=1;
}

}
if(flag!=1)
{
    System.out.println("-1");
}

	}
}
