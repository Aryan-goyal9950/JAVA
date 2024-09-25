import java.util.Scanner;
class count{
	public static void main(String s[]){
	int[] a=new int[100];
	int i=0,pos=0,neg=0,zero=0;
	System.out.println("enter number of values : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print("enter the value : ");
	for(i=0;i<n;i++){
	a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
	if(a[i] > 0){
	pos++;
}
	else if(a[i] < 0){
	neg++;
}
	else{
	zero++;‎
}
}
	System.out.println("positive : " +pos);
	System.out.println("negative : " +neg);
	System.out.println("zero : " +zero);
	

	
}
}
