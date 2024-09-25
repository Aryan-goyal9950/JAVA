class A7
{
	public static void main(String s[])
{
	int b[][]=new int[2][];
	int i=5;
	int j=10;
	int z=0;
	b[0]=new int[i];
	b[1]=new int[j];
	for(int m=0;m<b.length;m++)
{	for(int n=0;n<b[m].length;n++)
{
	System.out.println("HI-"+z);
	z++;
}	
}
}
}