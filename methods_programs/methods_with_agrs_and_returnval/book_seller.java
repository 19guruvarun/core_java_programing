class book_seller
{
	public static void main(String[] args) 
	{
		double res=get_cp(150,24.5);
	    System.out.println("Cost price of the book is : " +res);

	}
	public static double get_cp(int sp,double p)
	{
		double cp=sp-p;
		return cp;

	}
}
