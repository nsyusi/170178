import java.net.ServerSocket;
import java.io.IOException;

public class MyServer{
	//data
	//method
	//main
	public static void main(String[] args){
		//変数宣言
		ServerSocket serv = null;
		//コマンドラインを確認する
		String argsPortNum = args[0];
		System.out.print("ポート番号"+argsPortNum);
		//ポート番号をintにする
		int port = Integer.parseInt(argsPortNum);

		try{
			//サーバソケットを作る
			serv = new ServerSocket(port, 30);
		}catch(IOException e){
			System.err.println("エラー");
			System.exit(1);
		}
	}
} 