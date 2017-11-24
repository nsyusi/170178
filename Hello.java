import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	Hello(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("おして");

		JPanel p = new JPanel();
		p.add(b);

		Container c = getContentPane();
		c.add(p, BorderLayout.CENTER);
	}
	public static void main(String[] args){
		Hello h = new Hello("Window");
		h.setVisible(true);
	}
}