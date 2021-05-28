import java.awt.*;
import java.awt.event.*;

public class Actione {
    
	Frame f1=new Frame();
	Button b1= new Button("click");
	TextField Tf1=new TextField(90);
	Actione()
	{
		f1.setLayout(new FlowLayout());
		f1.add(Tf1);
		f1.add(b1);
		A a1=new A(Tf1);
		b1.addActionListener(a1);
		f1.setSize(550,550);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		Actione a =new Actione();
	
		

	}
class A implements ActionListener
{
	TextField Tf;
	A (TextField Tf)
	{
		this.Tf= Tf;
	}
	
  public void actionPerformed(ActionEvent ae)
{
	Tf.setText(" riya sharma  ");
}
}
	class NewClass extends WindowAdapter{
		public void windowClosing(WindowEvent e)

	{
			System.exit(0);
			}
	}
}

