import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class draw extends Frame {
    draw1() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(40, 40, 200, 200);
        g.drawOval(90, 70, 80, 80);
        g.drawOval(110, 96, 6, 6);
        g.drawOval(146, 96, 6, 6);
        g.drawLine(130, 95, 130, 115);
        g.drawArc(113, 115, 35, 20, 0, -180);
    }


    public static void main(String[] args) {
        draw1 d = new draw1();
        d.setSize(400, 400);
        d.setTitle("smily");
        d.setVisible(true);

    }
}
