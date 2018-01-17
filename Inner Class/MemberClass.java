class OuterClass
{
	int i;
	class InnerClass
	{
		int j;
		
	}
}

class MemberClass
{
	public static void main(String[] args)
	{
		OuterClass oc=new OuterClass();
		oc.i=5;

		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.j=6;
	}
}