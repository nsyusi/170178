import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlohaGui extends JFrame implements ActionListener{

	JTextField tf = new JTextField(10);

	AlohaGui(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("おして");
		b.addActionListener(this);

		JPanel p = new JPanel();
		p.add(b);
		p.add(tf);


		Container cp = getContentPane();
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args){
	AlohaGui ag = new AlohaGui("Window");
	ag.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("ALOHA!");
	}
}