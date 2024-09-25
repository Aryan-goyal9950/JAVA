import java.util.Scanner;

public class reverse{

	public static void main(String s[]){
	
//INPUT A STRING
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String sa=sc.next();

//BUILD A STRING
	StringBuilder sb=new StringBuilder(sa);
//REVERSE THE STRING
	for(int i=0;i<sb.length()/2;i++){
	
	int front=i;
	int back=sb.length()-i-1;

	char frontchar=sb.charAt(front);
	char backchar=sb.charAt(back);

	sb.setCharAt(front,backchar);
	sb.setCharAt(back,frontchar);
}
//PRINT THE REVERSED STRING
	System.out.println(sb);

}

}