class Phone
{
	public static void main(String[] args) 
	{
		
		System.out.println("main starts...");
		Phone p=new Phone();
		p.call();
		System.out.println("main ends...");

	}
	public   void call()
	{
		System.out.println("call starts..");
		chat();
		System.out.println("call ends..");
	}
	public static  void chat()
	{
		System.out.println("chat starts..");

		System.out.println("chat ends..");
	}
}
