class loan
{
	public static void main(String[] args) 
	{
		double res=find_si(10000,3,6.5);
	    System.out.println("Simple Interest is : " +res);

	}
	public static double find_si(int p,int t,double r)
	{
		double si=(p*t*r)/100;
		return si;

	}
}
