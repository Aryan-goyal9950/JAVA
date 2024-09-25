//to count total number of paths to go from (0,0) to (m,n) index.
public class recurr3{

	public static int count(int i,int j,int m,int n){
	if(i== m-1 && j==n-1)
{	
	return 1;
}
	if(i==m || j==n)
{
	return 0;
}
	int down_path=count(i+1,j,m,n);
	int right_path=count(i,j+1,m,n);
	return down_path+right_path;
}
	public static void main(String args[])
{
	int n=3,m=3;
	int total=count(0,0,m,n);
	System.out.println("total paths : "+total);
}

}