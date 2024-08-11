import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileEx03 {

	public static void main(String[] args) throws IOException {
		String[] menus = {"샐러드","아몬드3알","순두부찌개","라면","초코파이","치킨"};
		int[] prices = {3000,2000,1500,1000,500,10000};

		File dir = new File("c:/Temp/sub03");
		File file = new File(dir+"/menufile.txt");
		
		if(dir.exists() == false) {dir.mkdir();}
		if(file.exists() == false) {file.createNewFile();}
		
		System.out.println("폴더,파일 생성 성공");
		System.out.println();
		
		Writer writer = new FileWriter(file);
		String data;
		int i = 0;
		while(true) {
			System.out.println((i+1)+"-"+menus[i]+":"+prices[i]);
			data = (i+1)+" - "+menus[i]+":"+prices[i]+"\n";
			writer.write(data);
			writer.flush();
			i++;
			if(i >= menus.length) break;
		}
		writer.close();
		
//		Temp -> sub03 폴더 -> menufile 파일생성 -> 
//		
//		샐러드 : 3000 칼로리
//		아몬드3알 : 2000 칼로리
//		~~
//		치킨 : 10000 칼로리
		
	}

}
