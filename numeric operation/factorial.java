import java.util.Scanner;
class fatorial
{
	public static void main(String args[])
{
	int f=1;
	System.out.println("enter a number : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=n;
	while(n != 0){
	f=f * n;
	n=n-1;
}
	System.out.print("factorial of " +m); 
	System.out.println(" is : "+f);
}
}