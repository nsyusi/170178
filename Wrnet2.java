import java.io.*;
 import java.net.*;
 
 public class Wrnet2{
 	public static void main(String[] args){
  		byte[] buff = new byte[1024];
    		Socket socket = null;
      	InputStream is = null;
       	OutputStream os = null;
        	boolean cont = true;
      	
       try{
       socket = new Socket(args[0],Integer.parseInt(args[1]));//IPアドレス,ポート番号
       is = socket.getInputStream();
       os = socket.getOutputStream();
       
       int n = is.read(buff);
       System.out.write(buff,0,n);
       
       is.close();
       }catch(IOException e){
       	System.err.print("エラー");
        	System.exit(1);
         }
    }
}
 