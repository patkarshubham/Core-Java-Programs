 class Logical{
	public static void main(String args[]){
	int a=20,b=5,c=10;  
//AND
    System.out.println("--------- AND ---------");
	System.out.println(a>b&&a>c);
	System.out.println(a<b&&a<c);
	System.out.println(a>b&&a<c);   
	System.out.println(a<b&&a>c);	
//OR
    System.out.println("--------- OR ---------"); 	
	System.out.println(a>b||a>c);
	System.out.println(a<b||a<c);
	System.out.println(a>b||a<c);   
	System.out.println(a<b||a>c);
//NOT
    System.out.println("--------- NOT ---------");
	System.out.println(!(a>b));
	System.out.println(!(a<b));
	System.out.println(!(a<c));   
		
	}
}
ghiufuhuho