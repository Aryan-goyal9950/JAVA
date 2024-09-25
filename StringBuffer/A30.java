//to concatinate & append new string in string and string buffer.
class A30
{
	public static void main(String args[])
{
	String s="abc";
	StringBuffer sb=new StringBuffer("xyz");
	s=s.concat("xyz");
	sb.append("abc");
	System.out.println(s);
	System.out.println(sb);
}
}
