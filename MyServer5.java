import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer5{
	//data
	//method
	//main
	public static void main(String[] args){
		ServerSocket servSock = null;
		Socket clientSock = null;
		OutputStream os = null;
		PrintWriter pw = null;
		//コマンドライン引き巣を確認する
		String argsPortNum = args[0];
		System.out.println("ポート番号："+argsPortNum);
		//ポート番号をintにする
		int port = Integer.parseInt(argsPortNum);

		try{
			//サーバおけっとを作る
			servSock = new ServerSocket(port, 30);

			while(true){
				clientSock = servSock.accept();
				System.out.println("接続を受け付けました");
				//ソケットからクライアントのIPを取得する
				InetAddress iaClient = clientSock.getInetAddress();
				String ipClient = iaClient.toString();
				System.out.println("クライアントIP："+ipClient);
				//出力ストリームを取得して。PrintWriterに入れる
				os = clientSock.getOutputStream();
				pw = new PrintWriter(os);
				//クライアントにデータを送信する
				pw.println("ALOHA"); //ストリームにデータを書き込む
				pw.flush(); //実際に送信する
			}
		}catch(IOException e){
			System.err.println("サーバエラー");
			System.exit(1);
		}
	}
}