class shopkeeper 
{
	public static double loss_perc(int cp,double loss)
	{
		return (loss/cp)*100;
	}
	public static void main(String[] args) 
	{
		double res=loss_perc(200,20.5);
		System.out.println("Loss percentage of book is : "+res);
	}
}
