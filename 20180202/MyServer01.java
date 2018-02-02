import java.net.*;

public class MyServer01{
	public static void main(String[] args){
		ServerSocket serversock = null;
		Socket sock;

		try{
			serversock = new ServerSocket(6000,10);
		}catch(Exception e){
			System.exit(1);
		}
	}
}