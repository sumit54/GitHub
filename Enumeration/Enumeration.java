/*interface Mobile
{
	final String GOOGLE="Google";
	final String APPLE="Apple";
	final String SAMSUNG="Samsung";
	
}
*/

enum Mobile
{
	GOOGLE(20),APPLE,SAMSUNG;
	
	int price=10;

	Mobile()
	{
		System.out.println("Constructor");
	}
	Mobile(int price)
	{
		this.price=price;
	}

	
	public int getPrice()
	{
		return price;
	}
	
}

class Enumeration 
{
	
	public static void main(String[] args)
	{
	
		Mobile m=Mobile.GOOGLE; 
		
		System.out.println(Mobile.GOOGLE.getPrice());
			
	}
}