import java.net.*;
import java.io.*;

public class MyClient03 {
    public static void main(String[] args) {
        String remotehost = "localhost";
	String message = "ALOHA";

	try {
	    Socket sock = new Socket(remotehost, 5999);
	    
	    PrintWriter out = new PrintWriter(sock.getOutputStream());
	    BufferedReader in = new BufferedReader(
	                    new InputStreamReader(sock.getInputStream()));

	    out.print(message + "\r\n");
	    out.flush();
	    String s = in.readLine();
	    System.out.println(s);
	    sock.close();
	} catch (UnknownHostException e) {
	    System.err.println(e);
	} catch (IOException e) {
	    System.err.println(e);
	}
    }
}
