class NestedTry{
public static void main(String args[]){
int a[]={4,8,16,32,40};
int b[]={2,4,0,8};
for(int i=0;i<a.length;i++){
try{
	try{
 int x=a[i]/b[i];
 System.out.println("the values of x  : "+x);
	}
	catch(ArithmeticException e){
System.out.println(e);		
	}
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);		
	}

}


}