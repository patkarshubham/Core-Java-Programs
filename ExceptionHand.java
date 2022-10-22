import java.util.Scanner;
class ExceptionHand{
public static void main(String args[]){
System.out.print("enter first :");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.print("enter second :");
int b=sc.nextInt();
System.out.print("enter third :");
int c=sc.nextInt();
try
{
int d=(a+b)/c;
System.out.println("the value of D :"+d);
}
catch(ArithmeticException e){
	System.out.println("zero excep handle");
}
int e=(a+b)/a;
System.out.println("the value of E :"+e);

}
}