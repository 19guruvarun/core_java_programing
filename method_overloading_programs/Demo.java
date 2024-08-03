class Demo 
{
	public void display(char z)
	{
		System.out.println("Display method with char arg");
	}
	public void display(boolean a, boolean b)
	{
		System.out.println("Display method with boolean and boolean arg");
	}
	public void display(double i)
	{
		System.out.println("Display method with double arg");
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.display(true,false);
		d.display('v');
		d.display(2.5);
	}
}
