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
  
  public class MaouNigeru extends JFrame implements ActionListener{
    // data
    private JLabel label;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    //private JRadioButton rbtn3;
    
    // method
    public void actionPerformed(ActionEvent e) {
      // ラジオボタンが選択されているか、調べる
      Boolean kekka1 = this.rbtn1.isSelected();
      Boolean kekka2 = this.rbtn2.isSelected();
      //Boolean kekka3 = this.rbtn3.isSelected();            
      
      // 調べた結果を、ラベルに書き込む
      String msg = "";
      if(kekka1){
        msg = "まおうを倒した！";
        this.label.setText(msg);
      }
      if(kekka2){
        msg = "出直そう";
        this.label.setText(msg);
      }
      // if(kekka3){
      //   msg = this.rbtn3.getText()+"が選択されています。";
      //   this.label.setText(msg);
      // }
    }
    
    MaouNigeru(String title) {
      // JFrame
      setTitle(title);
      setSize(400, 400);
      setLocation(400, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // JRadioButton
      this.rbtn1 = new JRadioButton("こうげき");
      this.rbtn2 = new JRadioButton("にげる");
      //this.rbtn3 = new JRadioButton("Windows");   
      
      // ButtonGroup
      ButtonGroup rBtnGroup = new ButtonGroup();
      rBtnGroup.add(this.rbtn1);         
      rBtnGroup.add(this.rbtn2);         
      //rBtnGroup.add(this.rbtn3);               
      
      // JButton
      JButton btn = new JButton("OK");
      btn.addActionListener(this);
      
      // JLabel
      this.label = new JLabel("");
      
      // JPanel３
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(5, 1));
      panel.add(rbtn1);
      panel.add(rbtn2);
      //panel.add(rbtn3);            
      panel.add(btn);
      panel.add(this.label);
      
      // Container
      Container cp = getContentPane();
      cp.add(panel, BorderLayout.NORTH);
    }
    // main
    public static void main(String[] args) {
      MaouNigeru frame = new MaouNigeru("ALOHA");
      frame.setVisible(true); 
    }
  }