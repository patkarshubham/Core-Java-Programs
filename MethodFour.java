//with return type with parameter
class MethodFour{
int add(int a,int b){
	
	int c=a+b;
	System.out.println("a + b = "+c);
	return c;
	}
public static void main(String args[]){
MethodFour ob=new MethodFour();
MethodFour ob1=new MethodFour();
MethodFour ob2=new MethodFour();
int c=ob.add(10,5);
int e=ob1.add(28,2);
int d=c/3;
System.out.println("value of d= "+d);
}


}
