import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fukushu extends JFrame implements ActionListener{
	JCheckBox c;
	JLabel l;

	public void actionPerformed(ActionEvent e){
		if(c.isSelected()){
			l.setText(c.getText()+"がおされました");
		}else{
			l.setText("えらんで");
		}
	}
	Fukushu(String title){
		setTitle(title);
		setBounds(0,0,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("おして");
		b.addActionListener(this);


		c = new JCheckBox("A");
		l = new JLabel("");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,1));

		p.add(c);
		p.add(b);
		p.add(l);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.CENTER);
	}
	public static void main(String[] args){
		Fukushu f = new Fukushu("Window");
		f.setVisible(true);
	}
}