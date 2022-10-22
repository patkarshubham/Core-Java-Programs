
class SwitchLadder{
	public static void main(String args[]){		
    
	//System.out.print(" Enter Your Marks : ");

	int marks=100;
	String grade;
	switch(marks){	
	case 40:grade="fail!";
	break;
	case 50:grade="D";
	break;
	case 60:grade="C";
	break;
	case 70:grade="B";
	break;
	case 80:grade="A";
	break;
	case 90:grade="A+";
	break;
	case 100:grade="A++";
	break;
	default:
	grade="invalid input";
	break;
	}
	System.out.println("grade : "+grade);
}


}