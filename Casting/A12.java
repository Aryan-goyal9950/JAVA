//program to demonstrate the failure of DOWN CASTING in java
//-----------------------------------------------------------
class A12
{
	public static void main(String s[])
{
	B b=new D();
	C c=(C)b;
	System.out.println(c.i);
}
}
class C extends B
{
	int i=20;
}
class D extends B
{
	int i=30;
}
class B
{

}