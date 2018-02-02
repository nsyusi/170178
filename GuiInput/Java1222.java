import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Java1222 extends JFrame implements ActionListener{
	public JTextField namaet;
 	public JTextField jusyot;
 	public JTextField tanjobit;
 	public JTextField syumit;

 	public void actionPerformed(ActionEvent e){
 		String txt = "名前 : "+this.namaet.getText() +"\r\n"+ "住所 : "+this.jusyot.getText() +"\r\n"+ "生年月日 : "+this.tanjobit.getText() +"\r\n"+"好きなもの（音楽、食べもの）など : "+this.syumit.getText(); //+"\r\n"+"生年 : " +this.seinenda.getText();
 		Writer(txt);	
 		namaet.setText("");
 		jusyot.setText("");
 		tanjobit.setText("");
 		syumit.setText("");

 		// if(rb1.isSelected()){
 		// 	seibetu.setText("性別："+rb1.getText);
 		// }
 	}

	Java1222(String title){
		setTitle(title);
		setBounds(700,700,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(7,3));

		namaet = new JTextField("",10);
 		jusyot = new JTextField("",10);
 		tanjobit = new JTextField("",10);
 		syumit = new JTextField("",10);

 		JLabel namae = new JLabel("名前");
 		p.add(namae);
 		p.add(namaet);
 		JLabel jusyo = new JLabel("住所");
 		p.add(jusyo);
 		p.add(jusyot);
 		JLabel tanjobi = new JLabel("生年月日");
 		p.add(tanjobi);
 		p.add(tanjobit);
 		JLabel syumi = new JLabel("趣味");
 		p.add(syumi);
 		p.add(syumit);
 		JLabel seibetu = new JLabel("性別");
 		p.add(seibetu);

 		JRadioButton rb1 = new JRadioButton("男");
		p.add(rb1);
		JRadioButton rb2 = new JRadioButton("女");		
		p.add(rb2);
		JRadioButton rb3 = new JRadioButton("そのた");		
		p.add(rb3);


		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);


		JButton b = new JButton("登録");
		b.addActionListener(this);
 		p.add(b,BorderLayout.SOUTH);

		Container cp = getContentPane();
		cp.add(p, BorderLayout.NORTH);

	}
	public void Writer(String msg){
		try{
			File f1 = new File("data.txt");
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
 
 			bw.write(msg);
 				
 			bw.close();
 			
 
 		}catch(IOException e){
 			System.out.println("失　敗　。");
		}
	}
	public static void main(String[] args){
			Java1222 j1222 = new Java1222("Window");
			j1222.setVisible(true);
	}
}