class MainClass7 
{
	public static void main(String[] args) 
	{
		System.out.println("Product Selling process");
		Store s=new Store();
		s.sellProduct();
		Product.orderProduct();
		Category c=new Category();
		c.categorizeProduct();
	}
}
class Store 
{
	public  void sellProduct() 
	{
		System.out.println("selling the product pen");
		Product.displayDetails();
	}
	public  void restockProduct() 
	{
		System.out.println("restock the pen products");
	}
	public  void checkInventory() 
	{
		System.out.println("checking for available products");
	}
}
class Product 
{
	public static void displayDetails() 
	{
		System.out.println("ball point red pens");
		Store s=new Store();
		s.checkInventory();
	}
	public static void orderProduct() 
	{
		System.out.println("cello red pens are ordered");
		Store s=new Store();
		s.restockProduct();
	}
}
class Category 
{
	public static void createCategory() 
	{
		System.out.println("stationary items");
		Store s=new Store();
		s.sellProduct();
	}
	public void categorizeProduct() 
	{
		System.out.println("pens");
		Product.orderProduct();
	}
}
