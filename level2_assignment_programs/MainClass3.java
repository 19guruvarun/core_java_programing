class MainClass3
{
	public static void main(String[] args) 
	{
		System.out.println("Reviewing the story");
		Book.holdStory();
		Book b=new Book();
		b.navigatePage();
	}
}
class Author
{
	public static void writeStory() 
	{
		System.out.println("Author writing a novel");
	}
	public  void reviewStory(){
			System.out.println("review story");
	}
}
class Book
{
	public static void holdStory(){
			System.out.println("Book will holds the story");
			Author.writeStory();
	}
	public  void navigatePage(){
			System.out.println("from one to another page navigation starts");
			Author A=new Author();
			A.reviewStory();
	}
}
