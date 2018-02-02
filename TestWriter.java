import java.io.*;

public class TestWriter{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.append("ALHA\n");
			bw.close();
		}catch(IOException e){
			System.out.println("failed");
		}
	}
}