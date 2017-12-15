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

public class HelloJCheckBox2 extends JFrame implements ActionListener{
	JCheckBox[] c;
	JLabel[] l;
	public static void main(String[] args){
		HelloJCheckBox2 h2 = new HelloJCheckBox2("Window");
		h2.setVisible(true);
	}
	HelloJCheckBox2(String title){
		setTitle(title);
		setBounds(0,0,1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.c = new JCheckBox[1];
		this.c[0] =new JCheckBox("A");
		// JCheckBox c1 = new JCheckBox("A");

		this.l = new JLabel[1];
		this.l[0] = new JLabel();
		// JLabel l1 = new JLabel();

		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		p.setLayout(new GridLayout(4,2));
		for(int i = 0; i<1; i++){
		p.add(this.c[i]);
		p2.add(this.l[i]);

		}
		JButton b = new JButton("おして");
		b.addActionListener(this);
		JPanel p3 = new JPanel();
		p3.add(b);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);
		cp.add(p2, BorderLayout.CENTER);
		cp.add(p3, BorderLayout.SOUTH);
	} 
	public void actionPerformed(ActionEvent e){
		System.out.print("押されました");
		for(int i = 0; i<1; i++){
		if(this.c[i].isSelected()){
			this.l[i].setText("Aおされました");
		}else{
			this.l[i].setText("");
			}
		}
	}
}
