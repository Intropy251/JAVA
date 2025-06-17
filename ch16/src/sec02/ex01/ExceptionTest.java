package sec02.ex01;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;	//ArrayIndexOutOfBoundsException 예외
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		
		System.out.println("프로그램 종료");	//예외가 발생해도 정상 동작
	}

}
