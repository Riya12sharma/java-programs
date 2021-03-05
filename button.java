import java.awt.*;
import java.awt.event.*;

public class button extends Frame implements ActionListener{

	Button b1;
	Button b2;
	aMybutton(){
		this.setLayout(null);
		b1= new Button("red");
		b2= new Button("blue");
		
		b1.setBounds(100,100,75,45);
		b2.setBounds(100,150,75,45);
		
		this.add(b1);
		this.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListerner(new WindowAdapter()
				{
			    public void windowClosing(WindowEvent we)
			    {
			    	System.exit(0);
			    }
				}
	}
	
	private void addWindowListerner(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub
		
	}

	private void addActionListener(Mybutton mybutton) {
		// TODO Auto-generated method stub
		
	}

		@Override
	public void actionPerformed(ActionEvent e) {
		String str= e.getActionCommand();
		
		if(str.equals("red"))this.setBackground(Color.yellow);
		if(str.equals("blue"))this.setBackground(Color.red);
		
	}
public static void main(String[] args) {
Mybutton d =new Mybutton();
		
		d.setSize(300,300);
		d.setTitle("button");
		d.setVisible(true);


	}


}
