import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;

public class MyServer4{
	public static void main(String[] args){
		//変数宣言
		ServerSocket servSock = null;
		Socket clientSock = null;
		//コマンドライン引数を確認する
		String argsPortNum = args[0];
		System.out.print("ポート番号："+argsPortNum);
		//ポート番号をintにする
		int port = Integer.parseInt(argsPortNum);

		try{
			//サーバソケットを作る
			servSock = new ServerSocket(port, 30);

			while(true){
				//クライアントの接続を待ち受ける
				clientSock = servSock.accept();
				System.out.println("接続を受けつました");

				//ソケットからクライアントのIPを取得する
				InetAddress iaClient = clientSock.getInetAddress();
				String ipClient = iaClient.toString();
				System.out.println("クライアントIP："+ipClient);
			}
		}catch(IOException e){
			System.err.println("エラ－");
			System.exit(1);
		}
	}
} 