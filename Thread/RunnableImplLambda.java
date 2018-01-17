class Counterc implements Runnable
{

	 int countercvar=0;
	public void run()
	{
		while(countercvar<6)
		{
		countercvar++;
		System.out.println(countercvar);
		try{Thread.sleep(1000);}catch(Exception e){};
		}
	}

}
class Counterd implements Runnable
{

	 int counterdvar=100;
	public void run()
	{
		while(counterdvar<106)
		{
		counterdvar++;
		System.out.println(counterdvar);
		try{Thread.sleep(1000);}catch(Exception e){};
		}
	}

}
class RunnableImplLambda
{
public static void main(String... args) throws Exception
	{
		
		
		Runnable r1=()->{int countercvar=0;
							while(countercvar<6)
							{
							countercvar++;
							System.out.println(countercvar);
							try{Thread.sleep(1000);}catch(Exception e){};
							}
						};
		Thread t1=new Thread(r1);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){};
		
		Runnable r2=()->
						{int counterdvar=100;
							while(counterdvar<106)
							{
							counterdvar++;
							System.out.println(counterdvar);
							try{Thread.sleep(1000);}catch(Exception e){};
							}
						};
		Thread t2=new Thread(r2);
		t2.start();
		

	}
}