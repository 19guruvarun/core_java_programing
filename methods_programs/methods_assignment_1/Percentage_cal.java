class   Percentage_cal
{
	public static double perc(int p,double rup)
	{
		double rupinpaise=rup*100;
		return (p/rupinpaise)*100;
	}
	public static void main(String[] args) 
	{
		double res=perc(50,4.5);
		System.out.println("The percentage of 50 paise to 4.5 is: "+res+"%");
	}
}
