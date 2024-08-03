class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Mobile Charger");
		Mobile m=new Mobile();
		m.storePower();
		Charger ch=new Charger();
		ch.providePower();
	}
}
class Mobile
{
	public void storePower(){
		System.out.println("Store Power of 20watts");
	}
}
class Charger
{
	public void providePower(){
		System.out.println("provide power of 10watts");
	}
}

