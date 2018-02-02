import java.net.*;
import java.io.*;

public class MyClient01{
	public static void main(String[] args){
		Socket sock = null;
		InputStream is = null;

		try{
			sock = new Socket(args[0],Integer.parseInt(args[1]));
			is = sock.getInputStream();
		}
		catch(Exception e){
			System.err.print("エラー");
			System.exit(1);
		}
	}
}