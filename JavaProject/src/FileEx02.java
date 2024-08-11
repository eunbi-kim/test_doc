import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/Temp/test01.txt");
		
		String data = "안녕 자바 프로그램";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
		System.out.println("실행 성공");
	}

}
