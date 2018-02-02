import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class HelloMenu extends JFrame implements ActionListener{
	private JTextArea textArea;

public void actionPerformed(ActionEvent e){
	try{
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);

		String textFromFile = br.readLine();
		while(textFromFile !=null){
			System.out.println(textFromFile);
			textFromFile = br.readLine();
		}
		this.textArea.setText(textFromFile);
	}catch(IOException ie){
		System.out.println("失敗");
	}
}

	HelloMenu(String title){
		setTitle(title);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("FILE");
		menuBar.add(fileMenu);
		JMenuItem openFile = new JMenuItem("open");
		openFile.addActionListener(this);
		fileMenu.add(openFile);

		this.textArea = new JTextArea(10,20);
		Container cp = getContentPane();
		cp.add(textArea,BorderLayout.SOUTH);
	} 
	public static void main(String[] args){
		HelloMenu h = new HelloMenu("Window");
		h.setVisible(true);
	}
}