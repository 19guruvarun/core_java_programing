class time_cal 
{
	public static double time_taken(double s,int d)
	{
		double time=d/s;
		return time;
	}
	public static void main(String[] args) 
	{
		double res=time_taken(3.5,5);
		System.out.println("Time taken is : "+res+"hrs");
	}
}
