class formula_validation
{
	public static void main(String[] args) 
	{
	    System.out.println(lhs(3,4)+" = "+rhs(3,4));

	}
	public static int lhs(int a,int b)
	{
		return a*a+b*b;

	}
	public static int rhs(int a,int b)
	{
		return (((a+b)*(a+b)) -2*a*b);

	}
}
