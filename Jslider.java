import javax.swing.*;
public class myslide
{
    public static void main(String[] args)
	{
		JFrame o=new JFrame("My Slider program");
		o.setVisible(true);
	    o.setSize(600,600);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider s =new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		JPanel p=new JPanel();
		p.add(s);
		o.add(p);
   }   
}
