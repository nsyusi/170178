import java.io.*;
import java.net.*;

public class MyClient03{
	public static void main(String[] args){
		Socket sock;
		byte[] buff = new byte[1024];
		InputStream is = null;

		try{
			sock = new Socket(args[0],Integer.parseInt(args[1]));
			is = sock.getInputStream();

			int n = is.read(buff);
			System.out.write(buff,0,n);

			sock.close();

		}catch(Exception e){
			System.out.print("エラー");
		}
	}
}