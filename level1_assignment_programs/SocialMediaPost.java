class  SocialMediaPost
{
	public static void main(String[] args) 
	{
		System.out.println("Social Media Post Management System");
		SocialMediaPost smp=new SocialMediaPost();
		smp.createPost();
		System.out.println("");
	}
	public static void generatePostID(){
		System.out.println("generate your post ID");

	}
	public void createPost(){
		System.out.println("Create a post here");
		//createPost();
		generatePostID();
		publicPost();
		

	}
	public void publicPost(){
		System.out.println("This is a public post");

	}


}
