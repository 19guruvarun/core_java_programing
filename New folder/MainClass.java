class Train
{
	public static String boardingPoint="kachiguda";
	public String destinationPont;
	public String trainNumber;
	public String trainName;
	public int trainSpeed;
	public int journeyDis;
}
class MainClass 
{
	public static void main(String[] args) 
	{

		Train t1=new Train();
		t1.destinationPont="banglore";
		t1.trainName="banglore express";
		t1.trainNumber="kaba12";
		t1.trainSpeed=70;
		t1.journeyDis=800;
		System.out.println("Train 1 Details");
		System.out.println("Train Name :"+t1.trainName+" with train number "+t1.trainNumber+" started from "+Train.boardingPoint+" and destination is "+t1.destinationPont+" journey distance is "+t1.journeyDis+" km"+" travells with a speed of "+t1.trainSpeed+" km/hr and arriving time will be "+(t1.journeyDis/t1.trainSpeed)+" hrs");
		Train t2=new Train();
		t2.destinationPont="chennai";
		t2.trainName="chennai express";
		t2.trainNumber="kach26";
		t2.trainSpeed=90;
		t2.journeyDis=600;
				System.out.println("Train 2 Details---------------");
		System.out.println("Train Name :"+t2.trainName+" with train number "+t2.trainNumber+" started from "+Train.boardingPoint+" and destination is "+t2.destinationPont+" journey distance is "+t2.journeyDis+" km"+" travells with a speed of "+t2.trainSpeed+" km/hr and arriving time will be "+(t2.journeyDis/t2.trainSpeed)+" hrs");

	}
}
