import javax.swing.JFrame;
public class LargeJFrame extends JFrame{
	LargeFrame(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	public static void main(String[] args){
		LargeFrame f = new LargeFrame("ALOHA");
		f.setVisible(true);
	}
}

