import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame{

	HelloMenu(String title){
		setTitle(title);
		setBounds(0,0,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JMenuBar
		JMenuBar menubar = new JMenuBar();
		//JMenu
		JMenu menu = new JMenu("Menu");
		//JMenuItem
		JMenuItem menuitem1 = new JMenuItem("a");
		JMenuItem menuitem2 = new JMenuItem("b");

		//set,add
		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuitem1);
		menu.add(menuitem2);

	}
	public static void main(String[] args){
		HelloMenu hm = new HelloMenu("Window");
		hm.setVisible(true);
	}
}