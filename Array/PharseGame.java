class PharseGame
{
	public static void main(String[] args)
	{
		String[] wordArray1={"Sumit","Amit","Pratik","Vinayak"};
		String[] wordArray2={"Strong","Poor","Rich","Unique"};
		String[] wordArray3={"job","Car","Cycle","Flat","Job"};

		int randomNumber1=(int) Math.random();
		int randomNumber2=(int) Math.random();
		int randomNumber3=(int) Math.random();

		System.out.println(randomNumber1);
		System.out.println(randomNumber2);
		System.out.println(randomNumber3);
		System.out.println(wordArray1[randomNumber1]+" is "+wordArray2[randomNumber2]+" and have "+wordArray3[randomNumber3]);
	}
}