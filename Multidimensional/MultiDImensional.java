class MultiDImensional
{
	public static void main(String... args)
	{
		int[][] a=new int[3][3];
		int counter=0;
		for(int i=0;i <3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=counter;
				counter++;
				System.out.print(counter+" ");
			}
		System.out.println("");
		}
	}
}