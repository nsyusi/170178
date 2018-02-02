import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello8 extends JFrame implements ActionListener{
  JTextField tf = new JTextField(10);
  public void actionPerformed(ActionEvent e){
    tf.setText("Hello");
  }
  public static void main(String[] args){
    Hello8 h = new Hello8("Window");
    h.setVisible(true);
  }
  Hello8(String title){
    setTitle(title);
    setBounds(500,500,500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JButton b = new JButton("押して");
    b.addActionListener(this);
    p.add(tf);
    p.add(b);

    Container cp = getContentPane();
    cp.add(p,BorderLayout.CENTER);

  }
}