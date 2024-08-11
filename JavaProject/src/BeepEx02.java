import java.awt.Toolkit;

public class BeepEx02 {

	public static void main(String[] args) {
		// Thread 클래스 <-- 익명 구현 객체로 실행
		
		Thread thread = new Thread() {
			public void run() { 
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					System.out.println("땡");
					try {Thread.sleep(2000);}
					catch(Exception e) { }
				}
			}
		};
		thread.start();

		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(2000);}
			catch(Exception e) { }
		}
		
		
		
		
	}

}
