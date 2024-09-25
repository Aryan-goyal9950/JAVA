//to show the use of interface in java
class A23
{
	public static void main(String s[])
{
	B b=new B();
	System.out.println(b.a);
}
}
class B implements I
{

}
interface I
{
	int a=10;
}
