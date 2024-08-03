class BalloonSeller 
{
	public static String sellName="RAJA";
	public static String gas="Helium";
	public String balColor;

	public static void main(String[] args) 
	{
		BalloonSeller bs1=new BalloonSeller();
		BalloonSeller bs2=new BalloonSeller();
		BalloonSeller bs3=new BalloonSeller();
		BalloonSeller bs4=new BalloonSeller();
		bs1.balColor="red";
		bs2.balColor="orange";
		bs3.balColor="white";
		bs4.balColor="black";
		System.out.println("A balloon Seller "+sellName+" sells "+bs1.balColor+","+bs2.balColor+","+bs3.balColor+","+bs4.balColor+" balloons filled with "+gas+" gas.");
	}
}
