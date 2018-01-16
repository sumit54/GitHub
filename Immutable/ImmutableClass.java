import java.io.*;
import java.util.*;
final class ImmutableClass1
{
	private final String str;
	private final int i;
	//private final Date dateval;

	private ImmutableClass1(String str1,int i1)
	{
		this.str=str1;
		this.i=i1;
		//this.dateval=new Date(datevalue.getTime());
	}
	public static ImmutableClass1 getInstance(String str1,int i1)
	{
		return new ImmutableClass1(str1,i1);
	}

	public String getStr()
	{
		return str;
	}
	public int getI()
	{
		return i;
	}
}
class ImmutableClass
{
	public static void main(String[] args)
	{
		ImmutableClass1 iC=ImmutableClass1.getInstance("5",6);
		//iC=ImmutableClass1.getInstance("5",7);
		System.out.println(iC.getStr());
		System.out.println(iC.getI());
	}
}