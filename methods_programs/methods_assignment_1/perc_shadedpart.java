class  perc_shadedpart
{
	public static double cal_perc(int tol_p,double shad_p)
	{
		return (shad_p/tol_p)*100;
	}
	public static void main(String[] args) 
	{
		double res=cal_perc(10,3.0);
		System.out.println("The percentage of shaded part is : "+res);
	}
}
