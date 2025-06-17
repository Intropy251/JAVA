	package sec05.ex01;
	
	import java.util.Scanner;
	
	public class ScoreTest {
		public static int calcScore(int score) throws UserDefinedException {
			//예외 발생 시 예외를 호출한 곳으로 떠넘긴다.
			
			if(score < 0 || 100 < score) {
				throw new UserDefinedException("정확한 점수를 입력하세요.");
				//범위를 벗어난 점수를 입력하면 강제로 사용자 정의 예외 발생
			}
			
			return score;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("시험 점수를 입력하세요");
			
			int score = sc.nextInt();
			
			try {
				score = calcScore(score);
				System.out.println("입력한 시험 점수는 " + score + "입니다.");
				
			} catch(UserDefinedException e) {
				System.out.println(e.getUserExceptionInfo());
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("프로그램 종료");
		}
	
	}
