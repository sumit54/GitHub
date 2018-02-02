import java util.*;
interface Car
{
	public abstract String carName();
	public abstract void carColur();
}

abstract class CarAbstract implements Car
{

	public abstract String carName();
}

class ColourCar extends CarAbstract
{
	public abstract String carName()
	{
		return "BMW";
	}
	public abstract String carColur()
	{
		retunr "AUDI";
	}	
}
class CarType
{
	ArrayList<Car> carList=new ArrayList<>();
	
	public void addCar(Car car)
	{
		carList.add(car);
	}
	public void getCar()
	{
		for(Car car:carList)
		{
			car.carName();
		}	
	}
	public void show()
	{
		for(Car car:carList)
		{
			System.out.println("CarName"+car.carName());
			System.out.println("CarColour"+car.carColur());
		}
	}
}
class BuilderClass
{
	public CarType buildCar()
	{
		CarType c=new CarType();
		c.addCar(new ColourCar()); 
	}
}
class BuilderDemo
{
public static void main(Strin[] args)
	{
	BuilderClass bc=new BulderClass();
		CarType c=bc.buildCar();
		c.show();
	}
}