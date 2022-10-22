class Person{
String name;
int age;
} 
class Employee extends Person{
int empid;
int salary;
void show(){
System.out.println(empid+" "+name+" "+salary);
}
} 
class Programmer extends Employee{int bonous;
void display(){
System.out.println(empid+" "+name+" "+salary+" "+bonous+" "+age);
} } 
class MultilevelEx{
public static void main(String args[]){
//Employee e=new Employee();
//e.empid=1 01 ; e.salary=60000; e.name="Mohit"; //e.bonous=1 000;
//e.show();
//e.display();
Programmer p=new Programmer();
p.empid=100; 
p.salary=40000; 
p.name="Rohit"; 
p.bonous=2000; 
p.age=20;
p.show();
p.display();
}
}+