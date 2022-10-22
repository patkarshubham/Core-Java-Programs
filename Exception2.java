import java.util.Scanner;
class Exception2{
public static void main(String args[]){
System.out.println("enter first :");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter second :");
int b=sc.nextInt();
System.out.println("enter third :");
int c=sc.nextInt();
int d=(a+b)/c;
System.out.println("the value of D :"+d);
int e=a+b/a;
System.out.println("the value of E :"+e);
}
}