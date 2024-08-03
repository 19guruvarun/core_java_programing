class   RecipeManager
{
	public static void main(String[] args) 
	{
		System.out.println("Recipe Management System");
		RecipeManager rm=new RecipeManager();
		rm.prepareRecipe();
	}
	public void addIngredient(){
		System.out.println("add the ingredient");
		removeIngredient();
		//prepareRecipe();
		printRecipe();
	}
	public void removeIngredient(){
		System.out.println("remove the ingredient");
		calculateTotalCalories();
	}
	public void prepareRecipe(){
		System.out.println("prepare the recipe");
		addIngredient();
	}
	public static void calculateTotalCalories(){
		System.out.println("Total calories in the recipe");
	}
	public static void printRecipe(){
		System.out.println("print the recipe");
	}
}
