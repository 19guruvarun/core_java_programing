class TemperatureConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("TemperatureConverter");
		convertToFahrenheit();
	}
	public static void convertToFahrenheit() 
	{
		System.out.println("convert Celsius to Fahrenheit");

		TemperatureConverter tc1=new TemperatureConverter();
		tc1.setCelsiusTemperature() ;
		tc1.displayResult();

	}
	public  void setCelsiusTemperature() 
	{
		System.out.println("set Celsius Temperature");
	}
	public void displayResult() 
	{
		System.out.println("Result");
	}
}
