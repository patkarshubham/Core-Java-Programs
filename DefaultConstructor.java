class DefaultConstructor{
	int rollno;
	String name;
	void display(int r,String n){
		rollno=r;
		name=n;
		System.out.println("Student Roll number : "+rollno+" Student Name : "+name);
	}
public static void main(String args[]){
 DefaultConstructor st=new DefaultConstructor();
 st.display(10,"mahakaal");
}
}
