import javax.swing.*;
 import java.awt.*;
 import java.io.*;
 import java.awt.event.*;
 
 public class GuiInput extends JFrame implements ActionListener{
 
 	public JTextField jtf1;
 	public JTextField jtf2;
 	public JTextField gappi;
 	public JTextField seinenda;
 	public JTextField sukinamono;
 
 	public void actionPerformed(ActionEvent e){
 		String clear = e.getActionCommand();
 		
 		if(clear.equals("削除")){
 			jtf1.setText("");
 			jtf2.setText("");
 			gappi.setText("");
 			sukinamono.setText("");
 			
 		}
 		String txt = "名前 : "+this.jtf1.getText() +"\r\n"+ "住所 : "+this.jtf2.getText() +"\r\n"+ "生年月日 : "+this.gappi.getText() +"\r\n"+"好きなもの（音楽、食べもの）など : "+this.sukinamono.getText(); //+"\r\n"+"生年 : " +this.seinenda.getText();
 		Writer(txt);	
 		jtf1.setText("");
 		jtf2.setText("");
 	
 		gappi.setText("");
 		sukinamono.setText("");	
 
 		}
 
 	GuiInput(String title){
 		setTitle(title);
 		setSize(700,700);
 		setLocation(500,500);
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
 
 		JPanel panel = new JPanel();
 		panel.setLayout(new GridLayout(7,3));
 
 		JButton btn = new JButton("登録");
 		btn.addActionListener(this);
 
 		JButton clear = new JButton("削除");
 		clear.addActionListener(this);
 
 		JRadioButton jrbtn1 = new JRadioButton("女");
 		JRadioButton jrbtn2 = new JRadioButton("男");
 		JRadioButton jrbtn3 = new JRadioButton("その他");
 
 		JLabel label1 = new JLabel("名前");
 		JLabel label2 = new JLabel("住所");
 		JLabel seibetu = new JLabel("性別");
 		// JLabel seinen = new JLabel("生年");
 		JLabel tanzyoubi = new JLabel("生年月日");
 		JLabel etc = new JLabel("好きなもの,音楽,特徴,etc");
 
 		jtf1 = new JTextField("",12);
 		jtf2 = new JTextField("",10);
 		gappi = new JTextField("",10);
 		sukinamono = new JTextField("",10);
 
 		//  jtf1.setFont(new Font("Arial", Font.PLAIN, 30));
   //   	 jtf1.setAlignmentY(0.5f);
 
 
 		// gappi.setPreferredSize(new Dimension(60, 20));
 		
 		panel.add(label1);
 		panel.add(jtf1);
 		panel.add(label2);
 		panel.add(jtf2);
 		panel.add(tanzyoubi);
 		panel.add(gappi);
 		panel.add(etc);
 		panel.add(sukinamono);
 		panel.add(seibetu);
 		panel.add(jrbtn1);
 		panel.add(jrbtn2);
 		panel.add(jrbtn3);
 		panel.add(btn,BorderLayout.SOUTH);
 		panel.add(clear);
 
 		
 
 		Container cp = getContentPane();
 		cp.add(panel,BorderLayout.NORTH);
 	}
 
 	public void Writer(String msg){
 		try{
 
 
 			File fl = new File("data.txt");
 
 			FileWriter fw = new FileWriter(fl);
 
 			BufferedWriter bw = new BufferedWriter(fw);
 
 				bw.write(msg);
 				
 				bw.close();
 			
 
 		}catch(IOException e){
 			System.out.println("入力ができませんでした。");
 		}
 	}
 	public static void main(String[] args)throws IOException{
 		
 		GuiInput menu = new GuiInput("ようこそ");
 		menu.setVisible(true);
 	}
 }
