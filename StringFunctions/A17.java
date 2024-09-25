class A17
{
	public static void main(String args[])
{
	String s="abcde";
	int n=s.indexOf("d");
	System.out.println(n);
	int m=s.indexOf("x");//will return -1 as 'x' is not present in the given string.
	System.out.println(m);
}
}