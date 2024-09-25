//to add digits of a number till only one digit remains
//ex- n=149  ans-5
class A26
{
	public static void main(String s[])
{
	int n=246;
	int sum=0;
	int m=0;
if(n > 9)
{
	A26 a=new A26();
	a.add(n);
	sum=sum+a.add(n);
	while(true)
{
	
	if(sum < 10)
{
	System.out.println("Answer : "+sum);
	break;
}
else
{
	n=sum;
	sum=0;
	sum=sum+a.add(n);
}
}
}
else
{
	System.out.println(n);

}
	
}
int add(int n)
{
	int m=0,sum=0;
while(n!=0)
{
	m=n%10;
	sum+=m;
	n=n/10;
}

return sum;
}
}
