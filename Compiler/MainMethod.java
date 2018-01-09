//When JVM starts running which looking for main method in class to execute.

class MainMethod
{
	public static void main(String[] args)
	{
		System.out.println("public: Anyone can access this method");
		System.out.println("static: without creating object JVM can access this method by class name");
		System.out.println("void: no return value");
		System.out.println("main(String[] args): main method which takes array of string as a parameter");
	}
} 