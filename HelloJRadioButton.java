import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJRadioButton extends JFrame implements ActionListener{
	private JLabel l;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;

public void actionPerformed(ActionEvent e){

	Boolean kekka1 = this.rb1.isSelected();
	Boolean kekka2 = this.rb2.isSelected();
	Boolean kekka3 = this.rb3.isSelected();

	String msg = "";
	if(kekka1){
		msg = this.rb1.getText()+"が選択されています。";
		this.l.setText(msg);
	}
	if(kekka2){
		msg = this.rb2.getText()+"が選択されています。";
		this.l.setText(msg);
	}
	if(kekka3){
		msg = this.rb3.getText()+"が選択されています。";
		this.l.setText(msg);
		}
	} 
	HelloJRadioButton(String title){
		setTitle(title);
		setBounds(0,0,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("おして");
		b.addActionListener(this);

		this.rb1 = new JRadioButton("1");
		this.rb2 = new JRadioButton("2");
		this.rb3 = new JRadioButton("3");

		ButtonGroup g = new ButtonGroup();
		g.add(this.rb1);
		g.add(this.rb2);
		g.add(this.rb3);

		this.l = new JLabel("ここに結果表示");

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1));
		p.add(b);
		p.add(this.l);
		p.add(rb1);
		p.add(rb2);
		p.add(rb3);


		Container cp = getContentPane();
		cp.add(p, BorderLayout.CENTER);
	}
	public static void main(String[] args){
		HelloJRadioButton r = new HelloJRadioButton("Window");
		r.setVisible(true);
	}
}