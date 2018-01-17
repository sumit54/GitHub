class Counterc extends Thread
{

	 int countercvar=0;
	public void run()
	{
		while(countercvar<6)
		{
		countercvar++;
		System.out.println(countercvar);
		}
	}

}
class Counterd extends Thread
{

	 int counterdvar=100;
	public void run()
	{
		while(counterdvar<106)
		{
		counterdvar++;
		System.out.println(counterdvar);
		}
	}

}
class ThreadImpl
{
public static void main(String... args) throws Exception
	{
		
		Counterc t=new Counterc();
		Counterd t1=new Counterd();
		t.start();
		t.sleep(1000);
		t1.start();
		

	}
}