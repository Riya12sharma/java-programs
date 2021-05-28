import javax.swing.*;  
import java.awt.event.*;  
  
public class jtoggle extends JFrame implements ItemListener {  
     
    JToggleButton b;  
    jtoggle() {  
        setTitle("my Jtoggle Button"); 
        setSize(450,450);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
        setLayout(null);  
        b= new JToggleButton("ON");
        b.setBounds(100,200,150,150);	
        add(b); 
		b.addItemListener(this); 
        
    }  
     
    public void itemStateChanged(ItemEvent eve) {  
        if (b.isSelected())  
            b.setText("OFF");  
        else  
            b.setText("ON");  
    }  
	public static void main(String[] args) {  
        new jtoggle();  
    } 
} 
