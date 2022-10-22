import java.awt.*;
class FirstFrameEx extends Frame{
    FirstFrameEx(){
    
    this.setVisible(true);
    this.setSize(1800,800);
	this.setBackground(Color.green);
    this.setTitle("FirstFrame EX");
	}
	public void paint(Graphics g){
Font font =new Font("arial",Font.ITALIC+Font.BOLD,35);
g.setFont(font);
g.drawString("Shubham Patkar MCA 1st Year",500,400);
this.setForeground(Color.red);
	}
}
class FrameExtends{
public static void main(String args[]){
FirstFrameEx ff=new FirstFrameEx();
}
}