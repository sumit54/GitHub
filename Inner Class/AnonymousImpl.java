class OuterAnonymous
{
	public void show()
	{
		System.out.println("1");	
	}
}
class AnonymousImpl
{
	public static void main(String[] args)
	{
		OuterAnonymous obj=new OuterAnonymous()
					{
						public void show()
							{
								System.out.println("2");	
							}
					};
		obj.show();
	}
}