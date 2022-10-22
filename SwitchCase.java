import java.util.*;
class SwitchCase{
	public static void main(String args[]){		    
	int marks;
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter Your Marks : ");
	 marks = sc.nextInt();
	switch(marks){
		case 45:System.out.println("fail!");
        break;
    	case 50:System.out.println("D Grade");
    	break;
	    case 60:System.out.println("C Grade");
	    break;
	    case 70:System.out.println("B Grade");
	    break;
	    case 80:System.out.println("A Grade");
	    break;
	    case 90:System.out.println("A++ Grade");	
        break;	
	    default:System.out.println(" invalid input ! ");
        break;
                  }
	                                     }
                 }