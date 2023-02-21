package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		FileWriter file;
		try {
			file = new FileWriter("test.txt");
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
