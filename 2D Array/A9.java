class A9
{
public static void main(String s[])
{
	int a[][]={{1,2,3},{4,5},{6,7,8,9}};
	int z=0;
	for(int x[] : a)
{	double sum=0.0;
	for(int y : x)
{
	sum+=y;
}
	double avg=sum/a[z].length;
	z++;
	System.out.println("Average is : "+avg);
}
}
}