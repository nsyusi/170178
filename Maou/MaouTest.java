import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaouTest extends JFrame implements ActionListener{
  JLabel[] maouaraware;
  JLabel[] dousuru;
  JButton[] kougeki;
  JButton[] nigeru;
  public static void main(String args[]){
    MaouTest frame = new MaouTest("まおうを倒せ");
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    // if(this.nigeru.isSelected()){
    //    maouaraware[].setText("まおうからにげた！");
    //  }
  }
  MaouTest(String title){
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
    JLabel maouaraware = new JLabel("「まおうが現れた！」");
    maouaraware.setForeground(Color.white);
    maouaraware.setFont(new Font("HGP創英角ﾎﾟｯﾌﾟ体",Font.PLAIN,24));
    p.add(maouaraware);

    JPanel p2 = new JPanel();
    p2.setBackground(Color.white);

    JPanel p3 = new JPanel();
    p3.setBackground(Color.black);
    p3.setLayout(new GridLayout(3,4));
    Dimension footerPanelDimension = new Dimension(640, 200);
    p3.setPreferredSize(footerPanelDimension);
//どうする
    JLabel dousuru = new JLabel("「どうする？」");
    dousuru.setForeground(Color.white);
    //maouaraware.setFont(new Font("MS　ゴシック",Font.PLAIN,24));
    p3.add(dousuru);
//コマンド
    JButton kougeki  = new JButton("攻撃");
    kougeki.addActionListener(this);
    JButton nigeru = new JButton("逃げる");
    nigeru.addActionListener(this);
    p3.add(kougeki);
    p3.add(nigeru);
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