import java.util.*;

Class Main2
{
public static void main(String[]args)
{
int a[] =new int[10];
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
int max=a[0];
int min=a[0];
for(i=0;i<10;i++)
{
if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("The min value is :"+min);
System.out.println("The max values is :"+max);
}
}