//to calculate sum of a series.
import java.util.*;
class A14
{
	public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first value:");
	int a=sc.nextInt();
	System.out.println("Enter second value:");
	int b=sc.nextInt();
	System.out.println("Enter number of terms:");
	int n=sc.nextInt();
	double sum=pow1(a,b,n);
	System.out.println("Sum : "+sum);
}
	static double pow1(int a,int b,int n)
{
double sum=0.0;
double total=0.0;
	for(int i=0;i<n;i++)
{
	int d=i+1;
	total=((Math.pow(a,d+i))/(Math.pow(b,d+i+1)));
	sum=sum+total;
}
	return sum;
}
}
