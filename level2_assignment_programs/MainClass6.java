class MainClass6 
{
	public static void main(String[] args) 
	{
		System.out.println("Library Management");
		Library lb=new Library();
		lb.borrowBook();
		Book b=new Book();
		b.reserveBook();
	}
}
class Library
{
	public void borrowBook(){
		System.out.println("Borrowed wings of fire book ");
		Book.displayDetails();
	}
	public void returnBook(){
		System.out.println("returning harrypotter series book ");
	}
	public void checkAvailability(){
		System.out.println("Checking for available books");
	}
}

class Book
{
	public static void displayDetails(){
		System.out.println("wings of fire written by APJ Abdul Kalam");
		Library lb=new Library();
		lb.checkAvailability();
	}
	public void reserveBook(){
		System.out.println("Reserved the chosen book");
		Library lb=new Library();
		lb.returnBook();
	}
}
