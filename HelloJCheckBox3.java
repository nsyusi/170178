// CheckBoxつくるc1
// Labelつくるl1
// CheckBoxをおくPanelつくるp
// LabelおくPanelつくるp2
// 結びつけるadd
// Buttonつくる
// JButton b = new JButton("おして");
// 		b.addActionListener(this);
// ButtonをおくPanelつくるp3

// 位置
// Container cp = getContentPane();
// cp.add(p, BorderLayout.NORTH);
// cp.add(p2, BorderLayout.CENTER);
// cp.add(p3, BorderLayout.SOUTH);

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox3 extends JFrame implements ActionListener{


		JCheckBox c1 = new JCheckBox("A");
		JCheckBox c2 = new JCheckBox("B");
		JCheckBox c3 = new JCheckBox("C");

		JLabel l = new JLabel("ここに調べた結果を表示"); 


	public void actionPerformed(ActionEvent e){
		System.out.println("押されました");
		if(this.c1.isSelected()){
			this.l.setText(this.c1.getText()+"がおされました");
		}else if(this.c2.isSelected()){
			this.l.setText(this.c2.getText()+"がおされました");
		}else if(this.c3.isSelected()){
			this.l.setText(this.c3.getText()+"がおされました");
		}else{
			this.l.setText(this.c1.getText()+"か"+this.c2.getText()+"か"+this.c3.getText()+"を選んでください");
		}
	}
	HelloJCheckBox3(String title){
		setTitle(title);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		p.add(l);

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
		HelloJCheckBox3 h3 = new HelloJCheckBox3("Window");
		h3.setVisible(true);
	}
} 