import java.awt.Toolkit;

public class BeepEx05 {
	public static void main(String[] args) {
		Thread thread = new Thread(
				() -> {	
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					System.out.println("땡");
					try {Thread.sleep(1000);}
					catch(Exception e) { }
				}
			});
				
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(1000);}
			catch(Exception e) { }
		}
	}
}
