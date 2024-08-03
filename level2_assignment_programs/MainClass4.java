class MainClass4 
{
	public static void main(String[] args) 
	{
		int r=2;
		Calculator.findSquare(r);
		Circle c=new Circle();
		c.calculateCircumference(r);
	}
}
class Circle
{
	public void calculateArea(int r)
	{
		System.out.println("Area of circle with radius "+r+" is "+(3.14*r*r));
	}
	public void calculateCircumference(int r)
	{
		System.out.println("Circumference of circle with radius "+r+" is "+(2*3.14*2));
		Calculator.findCube(r);

	}
}
class  Calculator	
{
	
	public static void findSquare(int n)
	{

		System.out.println("Square of a number "+n+" is "+(n*n));
		Circle c=new Circle();
		c.calculateArea(n);
	}
	public static void  findCube(int n)
	{

		System.out.println("Cube of a number "+n+" is "+(n*n*n));

	}
}
