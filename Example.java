package pack1;
import pack2.Student;
public class Example
{
 public static void main(String []args)
 {
   Student s1=new Student();
   s1.setRollno(22);
   s1.setName("Shubham !");
 }
  System.out.println("Student Roll Number = "+s1.getRollno());
   System.out.println("Student Full Name = "+s1.getName());
}
