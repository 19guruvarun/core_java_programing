class Addition 
{
	public static void add(int i,int j)
	{
		System.out.println("adding of int,int args "+(i+j));
	}
	public static void add(double i,double j)
	{
		System.out.println("adding of double,int args "+(i+j));
	}
	public static void add(int i,double j)
	{
		System.out.println("adding of int,double args "+(i+j));
	}
	public static void main(String[] args) 
	{
		add(2,3);
		add(2.3,3.2);
		add(1,1.5);
	}
}
