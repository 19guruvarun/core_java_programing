class Product
{
	public void prod(int i,int j,int k)
	{
		System.out.println("Product of "+i+","+j+" and "+k+" is "+(i*j*k));
	}
	public void prod(int i,double j)
	{
		System.out.println("Product of "+i+","+j +" is "+(i*j));
	}
	public void prod(char a,char b)
	{
		System.out.println("Product of ACII values "+a+","+b+" is "+(a*b));
	}
	public static void main(String[] args) 
	{
		Product p=new Product();
		p.prod(2,3,1);
		p.prod(2,3.2);
		p.prod('A','B');
	}
}
