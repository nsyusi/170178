import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener{
	JCheckBox[] c;
	JRadioButton[] rb;
	JLabel[] l;

	public void actionPerformed(ActionEvent e){
		String msg = "";
		for(int i=0; i<3; i++){
		if(this.c[i].isSelected()){
			msg = msg + this.c[i].getText() + "が選ばれています";
			this.l[0].setText(msg);
		}else if(this.rb[i].isSelected()){
			 this.l[0].setText(this.rb[i].getText()+"が選ばれています");
			}
		}
	}
	Fukushu(String title){
		setTitle(title);
		setBounds(0,0,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		setJMenuBar(menuBar);

		JMenu fileMenu = new JMenu("File");

		JMenu editMenu = new JMenu("Edit");

		JMenu helpMenu = new JMenu("Help");

		JMenuItem fileItem1 = new JMenuItem("new");
		JMenuItem fileItem2 = new JMenuItem("open");
		JMenuItem fileItem3 = new JMenuItem("close");
		fileMenu.add(fileItem1);
		fileMenu.add(fileItem2);
		fileMenu.add(fileItem3);

		JMenuItem editItem1 = new JMenuItem("cut");
		JMenuItem editItem2 = new JMenuItem("copy");
		JMenuItem editItem3 = new JMenuItem("paste");
		editMenu.add(editItem1);
		editMenu.add(editItem2);
		editMenu.add(editItem3);

		JMenuItem helpItem1 = new JMenuItem("version");
		JMenuItem helpItem2 = new JMenuItem("index");
		helpMenu.add(helpItem1);
		helpMenu.add(helpItem2);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		JPanel boxp = new JPanel();

		this.c = new JCheckBox[3];
		this.c[0] = new JCheckBox("A");
		this.c[1] = new JCheckBox("B");
		this.c[2] = new JCheckBox("C");
		// boxp.add(this.c[0]);
		// boxp.add(this.c[1]);
		// boxp.add(this.c[2]);

		JPanel rbp = new JPanel();

		this.rb = new JRadioButton[3];
		this.rb[0] = new JRadioButton("1");
		this.rb[1] = new JRadioButton("2");
		this.rb[2] = new JRadioButton("3");
		// rbp.add(this.rb[0]);
		// rbp.add(this.rb[1]);
		// rbp.add(this.rb[2]);

		ButtonGroup bg = new ButtonGroup();
		// bg.add(this.rb[0]);
		// bg.add(this.rb[1]);
		// bg.add(this.rb[2]);

		JPanel buttonp = new JPanel();

		JButton b = new JButton("押して");
		buttonp.add(b);
		b.addActionListener(this);

		JPanel labelp = new JPanel();

		this.l = new JLabel[1];
		this.l[0] = new JLabel("ここに結果を表示");
		// this.l[1] = new JLabel("ここにrb結果を表示");

		for(int i=0; i<3; i++){
			boxp.add(this.c[i]);
			rbp.add(this.rb[i]);
			bg.add(this.rb[i]);
			labelp.add(this.l[0]);
		}
		Container cp = getContentPane();
		cp.add(boxp, BorderLayout.NORTH);
		cp.add(rbp, BorderLayout.CENTER);
		cp.add(buttonp, BorderLayout.EAST);
		cp.add(labelp, BorderLayout.SOUTH);
	}
	public static void main(String[] args){
		Fukushu f = new Fukushu("Window");
		f.setVisible(true);
	}
}