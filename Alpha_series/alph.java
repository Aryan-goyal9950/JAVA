import java.util.Scanner;
public class alph{

	public static void main(String s[]){
	System.out.println("enter a string : ");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int flag=0;
	StringBuilder sb=new StringBuilder(str);
	for(int i=0;i<sb.length();i++){
	for(int j=1;j<sb.length();j++){
	if(sb.charAt(i) != sb.charAt(j)){
	flag=1;
}
	else{
	flag=0;
	break;
}	

}
	if(flag == 1)
	System.out.println(sb.charAt(i));
}

}


}
