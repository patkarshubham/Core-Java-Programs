class MyException extends Exception{
String s;
MyException(String s){
this.s=s;
}
public String toString(){
return s;
}
}
class CustomExceptionEx{
void validate(int age) throws MyException{
if(age<18){
throw new MyException("not eligible");
}
else{
System.out.println("eligible");
}
public static void main(String args[]) throws MyException{
CustomExceptionEx ob=new CustomExceptionEx();
try{
ob.validate(17);
}
catch(MyException e 
	System.out.println(e);
}
}
}

