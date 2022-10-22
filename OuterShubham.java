class OuterShubham{
int a=19;
class InnerShubham{
	void show(){
System.out.println("Inner shubham class"+a);
}
}
public static void main(String args[]){
OuterShubham s=new OuterShubham();
OuterShubham.InnerShubham  ins=s.new InnerShubham();
ins.show();
}
}