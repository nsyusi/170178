import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
	JCheckBox[] check;
	JLabel[] lbl;

	public static void main(String[] args){
		HelloJCheckBox h = new HelloJCheckBox("Window");
		h.setVisible(true);
	}

	HelloJCheckBox(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.check = new JCheckBox[3];
		this.check[0] = new JCheckBox("A",true);
		this.check[1] = new JCheckBox("B");
		this.check[2] = new JCheckBox("C");

		this.lbl = new JLabel[3];
		this.lbl[0] = new JLabel();
		this.lbl[1] = new JLabel();
		this.lbl[2] = new JLabel();

		JPanel pnl = new JPanel();
		JPanel msg = new JPanel();

		pnl.setLayout(new GridLayout(1,3));
		msg.setLayout(new GridLayout(1,3));
		for(int i = 0; i<3; i++){
			pnl.add(this.check[i]);
			msg.add(this.lbl[i]);
		}
		JButton b = new JButton("おして");
		b.addActionListener(this);
		JPanel p = new JPanel();
		p.add(b);

		Container cp = getContentPane();
		cp.add(pnl, BorderLayout.NORTH);
		cp.add(msg, BorderLayout.CENTER);
		cp.add(p, BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e){
		System.out.println("おしta");
		for(int i = 0; i<3; i++){
			if(this.check[i].isSelected()){
				this.lbl[i].setText(this.check[i].getText()+"選択");
			}else{
				this.lbl[i].setText("");
			}
		}

	}
}