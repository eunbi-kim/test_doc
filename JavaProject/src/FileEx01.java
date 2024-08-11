import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) throws IOException {

		File dir = new File("c:\\Temp\\sub02");
		File file = new File("c:\\Temp\\test02.txt");
		
		if(dir.exists() == false) {dir.mkdir();}
		if(file.exists() == false) {file.createNewFile();}
		
		System.out.println("실행 성공");
	}
}
