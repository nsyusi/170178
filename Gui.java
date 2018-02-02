import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
  import java.io.*;
  
  public class Gui extends JFrame implements ActionListener{
  
  public JTextField tf1;
  public JTextField tf2;
  
  public void actionPerformed(ActionEvent e){
    //String clear = e.getActionCommand();
  String txt = "名前："+this.tf1.getText() + "電話番号："+this.tf2.getText();
  Writer(txt);
  tf1.setText("");
  tf2.setText("");
  }
  
  Gui(String title){
    setTitle(title);
    setBounds(0,0,500,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      JButton btn = new JButton("OK");
      btn.addActionListener(this);
      
      JPanel p = new JPanel();
      
      JLabel l1 = new JLabel("名前");
      JLabel l2 = new JLabel("電話番号");
      
      tf1 = new JTextField("",10);
      tf2 = new JTextField("",10);
      
      p.add(l1);
      p.add(tf1);
      
      p.add(l2);
      p.add(tf2);
      
      p.add(btn);
       
      Container cp = getContentPane();
      cp.add(p, BorderLayout.CENTER);
    }
    public void Writer(String msg){
      try{
     File f1 = new File("Gui.txt");
     FileWriter fw = new FileWriter(f1);
     BufferedWriter bw = new BufferedWriter(fw);
     bw.write(msg);
     bw.close();
     }catch(IOException e){
        System.out.println("失敗");
       }
     }
     
    public static void main(String[] args){
    Gui gi = new Gui("ようこそ");
      gi.setVisible(true);
    }
  }