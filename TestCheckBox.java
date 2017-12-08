import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.*;

public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JCheckBox c1 = new JCheckBox("A");
		JCheckBox c2 = new JCheckBox("B");
		JCheckBox c3 = new JCheckBox("C");

		p.add(c1);
		p.add(c2);
		p.add(c3);

		Container cp = getContentPane();
		cp.add(p,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestCheckBox t = new TestCheckBox("Window");
		t.setVisible(true);
	}
}

