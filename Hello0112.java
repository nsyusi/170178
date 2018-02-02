import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello0112 extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("テスト成功");
	}

	Hello0112(String title){
	setTitle(title);
	setBounds(500,500,500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel p = new JPanel();
	JButton b = new JButton("a");
	p.add(b);
	b.addActionListener(this);

	Container cp = getContentPane();
	cp.add(p, BorderLayout.CENTER);
	}
	public static void main(String[] args){
		Hello0112 h = new Hello0112("Window");
		h.setVisible(true);
	}
}