class ParameterConstructor{
	int rollno;
	String name;
    ParameterConstructor(int r,String n){
		rollno=r;
		name=n;
			}
			void display(){
			System.out.println("Student Roll number : "+rollno+" Student Name : "+name);
}
public static void main(String args[]){
 ParameterConstructor st=new ParameterConstructor(12,"mahakaal");
 //st.setData(10,"mahakaal");
 st.display();
}
}
