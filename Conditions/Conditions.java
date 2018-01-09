//While do-while for if switch
class Conditions
{
	int a=12;
	void doWhile()
	{
		do
		{
			System.out.println("In Do Loop: this code will execute either condition is false");
			a++;
		}
		while(a<=10);
			System.out.println("Out of loop");
		
	}
	
	void whileLoop()
	{
		while(a<=10)
		{
			System.out.println("In While Loop: this code will execute till condition is true");
			a++;
		}
	}

	void forLoop()
	{
		for(int i=0;i<=a;i++)
		{
			System.out.println("In For Loop: this code will execute from 0 to till condition is true");			
		}
	}
	
	void ifElse()
	{
		if(a==1)
		{	
			System.out.println("In IF Else: this code will execute if condition is true");			
		}
		else
		{
			System.out.println("In Else Loop: this code will execute if condition is false");			
		}
	}

	void switchCase()
	{
		switch(a)
		{
			case 1:
				System.out.println("in switch case: "+ a);
				break;
			case 2:
				System.out.println("in switch case: "+ a);
				break;
			case 3:
				System.out.println("in switch case: "+ a);
				break;
			default:
				System.out.println("in default: "+ a);

		}
	}
	public static void main(String[] args)
	{
		Conditions condition=new Conditions();
		//condition.doWhile();
		//condition.whileLoop();
		//condition.forLoop();
		//condition.ifElse();
		condition.switchCase();
	}
}