//to add even no. in string and multiply odd no. in the string.
class A20
{
public static void main(String args[])
{
	String s="12pq1794yt";
	int l=s.length();
	int sum=0;
	int mul=1;
	for(int i=0;i<l;i++)
{
	char c=s.charAt(i);
	boolean b=Character.isDigit(c);
	if(b == true)
{
	int x=Character.getNumericValue(c);
	if(x%2==0)
{
	sum+=x;
}
else
{
	mul=mul*x;
}
}
}

System.out.println("SUM OF EVEN VALUES: "+sum);
System.out.println("MULTIPLE OF ODD VALUES: "+mul);

}
}
