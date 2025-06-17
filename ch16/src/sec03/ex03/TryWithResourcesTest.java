package sec03.ex03;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesTest {
	public static void main(String[] args) {
		
		//1. try-catch문으로 예외 처리
		FileInputStream fis1 = null;
		try {
			fis1 = new FileInputStream("test.txt");
			int ch = fis1.read();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {	//파일을 닫기 위해 close() 메소드를 부르면서 다시 예외 처리 작업을 해주어야 한다.
				fis1.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//2. try-with-resources 사용
		try(FileInputStream fis2 = new FileInputStream("test.txt")) {
			int ch = fis2.read();
		} catch(IOException e) {
			System.out.println("IOException이 발생했습니다.");
		}
		
		
	}

}
