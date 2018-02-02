//サーバの接続して、データを3行送信するクライアント
//学籍番号、githubのユーザ名、何かのメッセージ
import java.io.*;
 import java.net.*;
 
 public class MyClient04{
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

       String msg = "\n" 
          + "\n" + "170178" + "\n"
          +"nsyusi" + "\n"
          +"ALOHA" + "\n";
       int n = is.read(buff);
       System.out.write(buff,0,n);
       
       is.close();
       }catch(IOException e){
       	System.err.print("エラー");
        	System.exit(1);
       }
    }
	}