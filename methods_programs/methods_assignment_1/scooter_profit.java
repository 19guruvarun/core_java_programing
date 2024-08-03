class scooter_profit
{
	public static double gain_perc(int cp,int sp)
	{
		double gain=sp-cp;
		return (gain/cp)*100;
	}
	public static void main(String[] args) 
	{
		double res=gain_perc(4700,5800);
		System.out.println("Gain percentage of scooter is : "+res+" %");
	}
}
