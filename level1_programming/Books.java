class Books 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Books b=new Books();
		b.write();
		System.out.println("main ends...");

	}
	public void write(){
		System.out.println("writing letter");
		read();
	}
	public static void read(){
		System.out.println("reading letter");

	}
}
