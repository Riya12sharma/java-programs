import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class swap {
    public static void main(String[] args) {

        Frame f=new Frame("welcome to my frame");

        Label l1=new Label("First");
        Label l2=new Label("second");

        TextField a1=new TextField(15);
        TextField a2=new TextField(15);

        Button b=new Button("done");

        f.add(l1);
        f.add(a1);
        f.add(l2);
        f.add(a2);
        f.add(b);
        f.setLayout(new FlowLayout());
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String temp=a1.getText();
                a1.setText(a2.getText());
                a2.setText(temp);
            }
        });

        f.setSize(400,400);
        f.setVisible(true);


    }
}
