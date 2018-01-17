class Outer
{
	int i;
	static class Inner
	{
		int j;
	}
}
class StaticInnerClass
{
	public static void main(String... args)
	{
		Outer outer=new Outer();
		outer.i=9;

		Outer.Inner oi=new Outer.Inner();
		oi.j=8;
		
	}
}