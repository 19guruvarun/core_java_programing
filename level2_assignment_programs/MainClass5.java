class MainClass5 
{
	public static void main(String[] args) 
	{
		System.out.println("Students taking exam");
		Student s=new Student();
		s.takeExam();
	}
}
class Student
{
	public void takeExam(){
		System.out.println("students should take the exam");
		Classroom.calculateAverageScore();
	}
	public void submitAssignment(){
		System.out.println("students must submit the assignment");
	}
}
class Classroom
{
	public static void calculateAverageScore(){
		System.out.println("Students average score is displayed");
		Student s=new Student();
		s.submitAssignment();
	}
	public static void conductDiscussion(){
		System.out.println("discussion with student");
	}
}
