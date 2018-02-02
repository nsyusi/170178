import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Maou extends JFrame implements ActionListener{
  JLabel[] maouaraware;
  JLabel[] dousuru;
  private JLabel label1;
   private JRadioButton rbtn1;
    private JRadioButton rbtn2;
  public static void main(String args[]){
    Maou frame = new Maou("まおうを倒せ");
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
  	Boolean kekka1 = this.rbtn1.isSelected();
      Boolean kekka2 = this.rbtn2.isSelected();
      //Boolean kekka3 = this.rbtn3.isSelected();            
      String msg = "";
      if(kekka1){
        msg = "まおうを倒した！";
        this.label1.setText(msg);
      }
      if(kekka2){
      msg = "出直そう";
      this.label1.setText(msg);
      }
    // if(this.nigeru.isSelected()){
    //    maouaraware[].setText("まおうからにげた！");
    //  }
  }
  Maou(String title){
    setTitle(title);
    setBounds(0, 0, 640, 640);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setBackground(Color.black);
//画面レイアウト
    JPanel p = new JPanel();
    p.setBackground(Color.black);
    Dimension HeaderPanelDimension = new Dimension(640, 60); 
    p.setPreferredSize(HeaderPanelDimension);
//「まおうが現れた」
    this.label1 = new JLabel("「まおうが現れた！」");
    label1.setForeground(Color.white);
    label1.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体",Font.PLAIN,24));
    p.add(label1);

    JPanel p2 = new JPanel();
    p2.setBackground(Color.white);

    JPanel p3 = new JPanel();
    p3.setBackground(Color.black);
    p3.setLayout(new GridLayout(1,1));
    Dimension footerPanelDimension = new Dimension(640, 200);
    p3.setPreferredSize(footerPanelDimension);
//どうする
    JLabel dousuru = new JLabel("「どうする？」");
    dousuru.setForeground(Color.white);
    //maouaraware.setFont(new Font("MS　ゴシック",Font.PLAIN,24));
    p3.add(dousuru);
//コマンド
    // JButton kougeki  = new JButton("攻撃");
    // kougeki.addActionListener(this);
    // JButton nigeru = new JButton("逃げる");
    // nigeru.addActionListener(this);
    // p3.add(kougeki);
    // p3.add(nigeru);
    this.rbtn1 = new JRadioButton("こうげき");
      this.rbtn2 = new JRadioButton("にげる");
      ButtonGroup rBtnGroup = new ButtonGroup();
      JButton b = new JButton("OK");
      b.addActionListener(this);
      rBtnGroup.add(this.rbtn1);         
      rBtnGroup.add(this.rbtn2); 
      p3.add(rbtn1);
      p3.add(rbtn2);
      p3.add(b);

//画像を表示
    ImageIcon icon1 = new ImageIcon("maou.jpg");
    JLabel label1 = new JLabel(icon1);
    label1.setIcon(icon1);
    p2.add(label1);

//画面位置
    Container cp = getContentPane();
    Container cp2 = getContentPane();
    Container cp3 = getContentPane();

    //Container cp2 = getContentPane();
    cp.add(p, BorderLayout.NORTH);
    cp2.add(p2, BorderLayout.CENTER);
    cp3.add(p3, BorderLayout.SOUTH);

    //cp2.add(text, BorderLayout.SOUTH);

    //getContentPane().setBackground(Color.black);
  }
}