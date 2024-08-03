class ShoppingCart 
{
	public static void main(String[] args) 
	{
		System.out.println("Online Shopping Cart Application");
		ShoppingCart sc=new ShoppingCart();
		sc.checkOut();
	}
	public void addItem() 
	{
		System.out.println("Add your item");
		calculateTotal();
	}
	public void removeItem() 
	{
		System.out.println("Remove the item");
		calculateTotal();
	}
	public void checkOut() 
	{
		System.out.println("check out the items");
		addItem();
		removeItem();
		generateInvoice();
	}
	public static void calculateTotal() 
	{
		System.out.println("calculate total");
	}
	public static void generateInvoice() 
	{
		System.out.println("generate invoice");
	}
}
