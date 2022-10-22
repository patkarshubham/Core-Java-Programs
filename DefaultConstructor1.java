class DefaultConstructor1{
	int rollno;
	String name;
    DefaultConstructor1(){
	}	
	void setData(int r,String n){
		rollno=r;
		name=n;
			}
			void display(){
			System.out.println("Student Roll number : "+rollno+" Student Name : "+name);
}
public static void main(String args[]){
 DefaultConstructor1 st=new DefaultConstructor1();
 st.setData(10,"mahakaal");
 st.display();
}
}
