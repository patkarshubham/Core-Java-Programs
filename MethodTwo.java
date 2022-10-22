//no return type with parameter
class MethodTwo{

void add(int a, int b){
	int c=a+b;
	System.out.println("a + b = "+c);
	}
public static void main(String args[]){
MethodTwo ob=new MethodTwo();
MethodTwo ob1=new MethodTwo();
MethodTwo ob2=new MethodTwo();
ob.add(15,20);
ob1.add(10,15);
ob2.add(5,56);

}

}
