import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.*;

public class TestJPasswordField extends JFrame{
	TestJPasswordField(String title){
		setTitle(title);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JLabel l1 = new JLabel("mail");
		JLabel l2 = new JLabel("pass");


		JTextField tf = new JTextField("",10);
		JPasswordField pf = new JPasswordField("Window");

		p.add(tf,BorderLayout.CENTER);
		p.add(l1,BorderLayout.CENTER);

		p.add(pf,BorderLayout.CENTER);
		p.add(l2,BorderLayout.CENTER);

		Container cp = getContentPane();
		cp.add(p,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		TestJPasswordField t = new TestJPasswordField("Window");
		t.setVisible(true);
	}
}

