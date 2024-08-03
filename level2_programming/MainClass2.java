class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Match.play();
		System.out.println("main ends...");

	}
}

class Match
 {
	 public static void play(){
		System.out.println("Play");
		Cricket.playsCricket();
		VolleyBall.playsVolleyBall();
	 }
 }

 class Cricket
 {
	 public static void playsCricket(){
		System.out.println("Play cricket");
	 }
 }
 class VolleyBall
 {
	 public static void playsVolleyBall(){
		System.out.println("Play volley ball");
	 }
 }