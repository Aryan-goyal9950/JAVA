//to claculate the length of string array 'args' by passing values to args at run time & will print the name starting with letter 'a'.
//----------------------------------------------------------------------------------------
class A19
{
	public static void main(String args[])
{
	System.out.println("length : "+args.length);
	for(String r : args)
{
	if(r.startsWith("a"))
{
	System.out.println(r);
}
}
}
}
