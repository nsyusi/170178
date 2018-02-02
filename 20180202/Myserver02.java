import java.net.*;

public class MyServer02{
	public static void main(String[] args){
		ServerSocket serversock = null;
		Socket sock;
		String ip = 

		try{
			serversock = new ServerSocket(5999,10);
		}catch(Exception e){
			System.exit(1);
		}
	}
}