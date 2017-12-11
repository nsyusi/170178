import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox2 extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.print("押されました");
		// if(c.isSelected()){
		// 	l.setText("Aがおされました");
		// }
	}
	HelloJCheckBox2(String title){
		setTitle(title);
		setBounds(0,0,1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel l = new JLabel("ここに調べた結果を表示"); 
		p.add(l);


		JCheckBox c1 = new JCheckBox("A");
		JCheckBox c2 = new JCheckBox("B");
		JCheckBox c3 = new JCheckBox("C");

		p.add(c1);
		p.add(c2);
		p.add(c3);


		JButton b = new JButton("おして");
		b.addActionListener(this);
		p.add(b);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);
	}
	public static void main(String[] args){
		HelloJCheckBox2 h2 = new HelloJCheckBox2("Window");
		h2.setVisible(true);
	}
} 