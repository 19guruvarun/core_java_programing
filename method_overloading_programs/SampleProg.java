class SampleProg 
{
	public static void test(int i,int j)
	{
		System.out.println("test method with int,int args");
	}
	public static void test(String s)
	{
		System.out.println("test method with string args");
	}
	public static void test(double i,int j)
	{
		System.out.println("test method with double,int args");
	}
	public static void test(char  c,boolean b,char a)
	{
		System.out.println("test method with char,boolean,char args");
	}
	public static void main(String[] args) 
	{
		test(2,3);
		test("varun");
		test('v',true,'s');
		test(1.5,3);
	}
}
