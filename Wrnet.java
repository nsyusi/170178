import java.io.*;
import java.net.*;

public class Wrnet{
	
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		Socket wrsocket = null;
		InputStream instr = null;
		OutputStream outstr = null;
		boolean cont = true;

		try{
			wrsocket = new Socket(args[0],Integer.parseInt(args[1]));
			instr = wrsocket.getInputStream();
			outstr = wrsocket.getOutputStream();
		}catch(Exception e){
			String msg = "ALOHA";
			System.out.println(msg);
			System.exit(1);
		}
		while(cont){
			try{
				int n = System.in.read(buff);
				if(buff[0] == '.')cont = false;
				else outstr.write(buff,0,n);
			}catch(Exception e){
				System.exit(1);
			}
		}
		cont = true;
		while(cont){
			try{
				int n = instr.read(buff);
				System.out.write(buff,0,n);
			}catch(Exception e){
				cont = false;
			}
		}
		try{
			instr.close();
		}catch(Exception e){
			System.err.println("エラー");
			System.exit(1);
		}
	}
}