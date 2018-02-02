import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class MyServer3{
	public static void main(String[] args){
		//変数宣言
		ServerSocket servSock = null;
		Socket clientSock = null;
		//コマンドライン因数を確認する
		String argsPortNum = args[0];
		System.out.println("ポート番号："+argsPortNum);
		//ポート番号をintにする
		int port = Integer.parseInt(argsPortNum);

		try{
			//サーバソケットを作る
			servSock = new ServerSocket(port, 30);

			while(true){
				//クライアントの接続を受け付ける
				clientSock = servSock.accept();
				System.out.print("接続を受け付けました。");
			}
			}catch(IOException e){
				System.err.println("サーバエラー");
				System.exit(1);
		}
	}
}