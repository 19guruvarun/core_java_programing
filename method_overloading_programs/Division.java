class Division
{
	public static double quot(int i,int j)
	{
		return (double)i/j;
	}
	public void quot(double a,double b)
	{
		System.out.println("Quotient of "+a+","+b+" is "+(a/b));
	}
	public static void main(String[] args) 
	{
		double res=quot(3,2);
		System.out.println("Result:"+ res);
		Division d=new Division();
		d.quot(5.1,2.1);
	}
}
