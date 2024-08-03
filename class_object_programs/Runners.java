class Runners 
{
		public static double distance=10;
		public String runnerName;
		public double speed;
	public static void main(String[] args) 
	{
		
			Runners r1=new Runners();
			Runners r2=new Runners();
			Runners r3=new Runners();
			r1.runnerName="RAJ";
			r1.speed=5;
			r2.runnerName="JAMES";
			r2.speed=7;
			r3.runnerName="ALI";
			r3.speed=6;
			System.out.println("----Runners Details-------");
			System.out.println(r1.runnerName+" runs "+distance+"Km marathon at the speed of "+r1.speed+"Km/Hr and "+r1.runnerName+" completes the race in "+(distance/r1.speed)+" hrs.");
			System.out.println(r2.runnerName+" runs "+distance+"Km marathon at the speed of "+r2.speed+"Km/Hr and "+r2.runnerName+" completes the race in "+(distance/r2.speed)+" hrs.");
			System.out.println(r3.runnerName+" runs "+distance+"Km marathon at the speed of "+r3.speed+"Km/Hr and "+r3.runnerName+" completes the race in "+(distance/r3.speed)+" hrs.");

	}
}
