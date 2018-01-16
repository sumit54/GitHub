class AnnonymousClass
{
	static class StaticInsideClass
	{
		void m1()
		{
			System.out.println("In Static method");
		}	
	} 
public static void main(String... args)
	{
		AnnonymousClass.StaticInsideClass as=new AnnonymousClass.StaticInsideClass();
		as.m1();
	}
}