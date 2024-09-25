//to pritnln the class name of the variable passed.
class A22
{
	public static void main(String s[])
{
	B.show(1,1.2,"aryan",'c');
}
}
class B
{
	static void show(Object ...x)
{
	for(Object m : x)
{
	System.out.println(m.getClass().getName());
}
}
}
