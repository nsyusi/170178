import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.*;

public class TestJPasswordField extends JFrame{
	TestJPasswordField(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JLabel l1 = new JLabel("mail");
		JLabel l2 = new JLabel("pass");
		JTextField tf = new JTextField("",20);
		JPasswordField pf = new JPasswordField("",10);

		p.add(tf);
		p.add(l1);

		p.add(pf);
		p.add(l2);

		p.setLayout(new GridLayout(2,2));

		Container cp = getContentPane();
		cp.add(p,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestJPasswordField t = new TestJPasswordField("Window");
		t.setVisible(true);
	}
}

