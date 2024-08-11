import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileEx04 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("c:/Temp/sub04");
		Path path2 = Paths.get(path1+"/test04.txt");
		
		if(Files.notExists(path1)){
			Files.createDirectories(path1);}
		if(Files.notExists(path2)){
			Files.createFile(path2);}
		System.out.println("실행 성공");
	}

}
