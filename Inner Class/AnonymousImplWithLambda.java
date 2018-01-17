class OuterAnonymous1
{
	public void show()
	{
		System.out.println("1");	
	}
}
interface OuterAnonymous
{
	abstract public void show();
}
class AnonymousImplWithLambda
{
	public static void main(String[] args)
	{
		
		OuterAnonymous obj=()->System.out.println("3");
			obj.show();
	}
}