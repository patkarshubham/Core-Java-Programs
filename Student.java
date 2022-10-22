class Student{
	int rollno;
	String name;
	String s1="hello";
	String s2="java";
	String s3=s1+s2;
	void getInfo(){
		int z;
		System.out.println("the name of student :"+name+" "+"and rollno:"+rollno);
		System.out.println("messege"+" "+s3);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.rollno=10;
		s1.name="shubh";
		s1.getInfo();
		
	}
}
