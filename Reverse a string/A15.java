import java.util.*;
class A15
{
	public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string :");
	String str=sc.next();
	String x="";
	for(int i=str.length()-1;i>=0;i--)
{
	char c=str.charAt(i);
	x=x+c;
}
	System.out.println(x);
}
}
