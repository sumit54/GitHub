class Counter implements Runnable
{
		static int counter=0;
			public void run()
				{
				synchronized(this){
				while(counter<10){
				System.out.println(counter);
				counter++;
				try{Thread.sleep(1000);}catch(Exception e){};
					}}
				}
}
class SynchronisedClass
{
	
	public static void main(String... args)throws Exception
	{
	
		Runnable r1=new Counter();
		Thread t1=new Thread(r1);
			t1.start();//t1.join();
		Runnable r2=new Counter();
		Thread t2=new Thread(r2);
			t2.start();
		
	}
}