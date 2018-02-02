import java.net.Socket;
import java.io.IOException;

public class MyClient1{
	//data
	//method
	//main
	public static void main(String[] args){
		//変数宣言
		Socket sock = null;
		//サーバーに接続して～する
		try{
			//IPアドレスとポート番号を取得する
			String ipAddr = args[0];
			int portNum = Integer.parseInt(args[1]);
			//サーバに接続
			sock = new Socket(ipAddr,portNum);
			System.out.println("サーバに接続しました");
		}catch(IOException e){
			System.err.println("クライアントエラー");
			System.exit(1);
		}
	}
}