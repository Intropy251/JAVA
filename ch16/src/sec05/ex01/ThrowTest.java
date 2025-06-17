package sec05.ex01;

import java.io.IOException;

public class ThrowTest {
	public static void call() throws IOException {
		System.out.println("call() 메서드 시작");
		
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;	//ArrayIndecOutOfBoundsException 발생
		
		if(num.length == 2) {
			throw new IOException("배열크기가 2");	//강제적으로 예외발생 시 예외 원인을 메시지 필드에 초기화
		}
		System.out.println("call() 메서드 종료");
		
	}
	
	public static void main(String[] args) {
		try {
			call();
		} catch(IOException e) {
			String message = e.getMessage();	//예외 발생시 생성된 메시지를 얻는다.
			System.out.println(message);
		} catch(Exception e) {
			e.printStackTrace();	//예외 발생 위치를 메서드 호출 과정으로 출력
		}
		
		System.out.println("프로그램 종료");
	}

}
