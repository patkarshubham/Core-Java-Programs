class Throw{
static void validate(int age){
if(age<18){
throw new ArithmeticException("you are not eligible");
}
else{
	System.out.println("you are eligible");
}
}
public static void main(String args[]){
	try{
		Throw.validate(17);
	}
	catch(ArithmeticException e){
		System.out.println(e);
}
}
}n