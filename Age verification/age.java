import java.util.Scanner;
class age
{
	public static void main(String s[]){
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your age : ");
	age=sc.nextInt();
	if(age>=18)
{
	System.out.println("you are an adult");
}
	else{
	System.out.print("you are not an adult");
}
}	
}
