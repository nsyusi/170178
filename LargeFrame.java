 import javax.swing.JFrame;
  
  public class LargeFrame extends JFrame {
    // data
    // method
    LargeFrame(String title) {
      setTitle(title);
      setLocation(0, 0);
      setSize(1000, 1000);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // main
    public static void main(String[] args) {
      LargeFrame frame = new LargeFrame("ALOHA");
      frame.setVisible(true);
    }
  }