class Student
{
	public static String schoolName="VJIT";
	public String stdName;
	public double perc;
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.stdName="varun";
		s1.perc=86.5;
		s2.stdName="viteesh";
		s2.perc=82.35;
		s3.stdName="veeru";
		s3.perc=76.7;
		System.out.println("Student 1 details");
		System.out.println(s1.stdName);
		System.out.println(s1.perc);
		System.out.println("Student 2 details");
		System.out.println(s2.stdName);
		System.out.println(s2.perc);
		System.out.println("Student 3 details");
		System.out.println(s3.stdName);
		System.out.println(s3.perc);
	}
}
