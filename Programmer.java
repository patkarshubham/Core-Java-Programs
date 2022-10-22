//Single inheritance
class Employee{
 int empid;
 int salary;
 String name;
 void show(){
	 System.out.println(empid+" "+name+" "+salary);
 }
}
class Programmer extends Employee{
int bonous;
void display(){
	System.out.println(empid+" "+name+" "+salary+" "+bonous);
}
public static void main(String args[]){
	Programmer p=new Programmer();
	p.empid=100;
	p.salary=50000;
	p.name="shubham";
    p.show();
	p.display();
	System.out.println(p.empid+" "+p.name+" "+p.salary+" "+p.bonous);
}
}