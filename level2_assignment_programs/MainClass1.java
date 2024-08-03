class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("Volleyball Match");
		Player.play();
		Volleyball.move();
	}
}
class Player
{
	public static void play(){
		System.out.println("play the game");
	}
}
class Volleyball
{
	public static void move(){
		System.out.println("ball is moving 2km/hr");

	}
}
