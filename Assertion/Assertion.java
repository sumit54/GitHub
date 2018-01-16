class Assertion
{
	public static void main(String[] args)
	{
		int age=140;
		
		assert(age>0 && age<101):"Age is "+age;
		
		if(age<40)
		{
			System.out.println(age);
		}	
		
		System.out.println(age);
	}
}