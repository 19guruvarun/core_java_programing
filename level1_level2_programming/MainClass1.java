class MainClass1 
{
	public static void sell(){
		System.out.println("sell the book");
		Book.holdInformation();
		Author a=new Author();
		a.write();

	}
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		sell();
		System.out.println("main ends...");
	}
}
class Book
{a
	public static void holdInformation(){
		System.out.println("Book have information..");
		openBook();
	}
	public static void openBook(){
		System.out.println("Open the book");
	}
}
class Author
{
	public void imagineStory(){
		System.out.println("Author will imagine story");
	}
	public void write(){
		System.out.println("Author writing story");
		imagineStory();
	}
}
