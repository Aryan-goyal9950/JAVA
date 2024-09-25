//to print palindrome elements passed through command line arguments.
class A28
{
	public static void main(String args[])
{
	boolean b;
	for(String x:args)
{
	b=A29.ispalin(x);
	if(b==true)
{
	System.out.println(x);
}
}	
}

}
class A29
{
static boolean ispalin(String m)
{
	StringBuffer sb=new StringBuffer(m);
	sb.reverse();
	String n=sb.toString();
	if(n.equals(m))
{
	return true;
}
	else
{
	return false;
}
		
}
}