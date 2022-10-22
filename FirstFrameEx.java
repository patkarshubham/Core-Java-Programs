import java.awt.*;
class FirstFrame extends Frame{
    FirstFrame(){
    
    this.setVisible(true);
    this.setSize(1000,300);
	this.setBackground(Color.green);
    this.setTitle("FirstFrame EX");
	}
	public void paint(Graphics g){
Font font =new Font("arial",Font.ITALIC+Font.BOLD,35);
g.setFont(font);
g.drawString("Shubham",100,50);
this.setForeground(Color.red);
	}
}
class FirstFrameEx{
public static void main(String args[]){
FirstFrameEx ff=new FirstFrameEx();
}
}