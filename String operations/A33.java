class A33
{
	public static void main(String args[])
{

	String s="amiiit";
	for(int i=1;i<=s.length();i++)
{
	for(int j=i;j<=s.length();j++)
{	
	A34.ispalin(s.substring(i,j));
}
}

}

}
class A34
{
static int v=-1;
static String[] t=new String[20];
static void ispalin(String x)
{	
	if(x.length() > 1)
{
 	int z=-1;
	StringBuffer sb=new StringBuffer(x);
	int flag=0;
	sb.reverse();
	String m=sb.toString();
	
	if(x.equals(m))
{
	if(t[0] == null)
{
	t[0]=m;
}
	
	for(int i=0;i<t.length;i++)
{
	if(m == t[i])
{
	flag=1;
	break;
}
}

if(flag == 0)
{
	v++;
	t[v]=m;
	System.out.println(m);
}

}

}
}
}
