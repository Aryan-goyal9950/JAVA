import java.util.Scanner;
class palindrome
{
	public static void main(String args[]){
	System.out.println("enter a number : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rev=0;
	int m=n;
	while(n != 0){
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
	if(rev == m){
	System.out.println("number is palindrome");
}
	else{
	System.out.println("number is not palindrome");
}
}
}