import java.util.*;
class NestedIf{
	public static void main(String args[]){
		
    Scanner sc = new Scanner(System.in);
	System.out.print(" Enter Your Age : ");
	int age = sc.nextInt();
	System.out.print(" Enter Your Weight : ");
	float weight = sc.nextFloat();
	if(age>=18){
		if(weight>=50){
			System.out.println("You are eligible for donate blood !");
		}
		else{
			System.out.println("Your weight is less than 50 then you are not eligible for donete blood !");
	}
	}
	else{
	System.out.println(" Your age is less than 18 so you are not eligible for donate blood ! ");
	}
	}
	
	
}