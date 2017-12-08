 import javax.swing.JFrame;
  
  public class LargeFrame extends JFrame {

    LargeFrame(String title) {
      setTitle(title);
      setLocation(0, 0);
      setSize(1000, 1000);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
<<<<<<< HEAD

=======
   
>>>>>>> 402d740c14bf2fa0296133e1ac24f808477a3bf5
    public static void main(String[] args) {
      LargeFrame frame = new LargeFrame("ALOHA");
      frame.setVisible(true);
    }
  }
