//add values if numbers are in a sequence of more than 2 digits
class A21
{
public static void main(String args[])
{
	String s="12pq179yt";
	int l=s.length();
	int sum=0;
	int t=0;
	int m=0;
	for(int i=0;i<l;i++)
{
	char c=s.charAt(i);
	boolean b=Character.isDigit(c);
	if(b == true)
{
	int x=Character.getNumericValue(c);
	if(m == -1)
{
	m=0;
	t=0;
}
m++;
t=t+x;
if(m>2)
{
sum+=t;
System.out.println("SUM : "+sum);
}
}
else
{
m=-1;
}
}

}
}