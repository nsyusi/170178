import javax.swing.*;
import java.awt.*;
public class TestGui extends JFrame{
	TestGui(String title){
		setTitle(title);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField tf = new JTextField("",10);
		JPasswordField pf = new JPasswordField("Window");

		p.add(tf,BorderLayout.NORTH);
		p.add(pf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(p,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestGui f = new TestGui("Window");
		f.setVisible(true);
	}
}

