class Mobile
{
	public static void brand(){
		System.out.println("Mobile brand poco M3");
	}
	public void specifications(){
		brand();
		System.out.println("100mb pexels");
		
	}
}

class Laptop
{
	public void laptopPrice(int price){
		System.out.println("Price of laptop is "+price);
		Mobile m=new Mobile();
		m.specifications();
	}
}

class MainClass2 
{
	public void deviceType(){
		System.out.println("Electronic devices");
		Laptop lp=new Laptop();
		lp.laptopPrice(50000);
		Mobile.brand();
	}
	public static void main(String[] args) 
	{
		MainClass2 m=new MainClass2();
		System.out.println("main starts...");
		m.deviceType();
		System.out.println("main ends...");
	}
}