class Bike 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		travel();
		System.out.println("main ends...");
	}
	public static void travel(){
		System.out.println("traveling with bike");
		Bike b=new Bike();

		b.racing();
	}
	public void racing(){
		System.out.println("racing starts");

	}
}
