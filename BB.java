import javax.swing.*;
class BB
{
  public BB()
  {
	JFrame fr=new JFrame("Calculator");
	fr.setSize(300,300);
	fr.setLocationRelativeTo(null);
	fr.setResizable(false);
	fr.setDefaultCloseOperation(3);
	fr.setVisible(true);
  }
  public static void main(String []args)
  {
	new BB();
  }
}