	package main;
	
	import car.Car;
	import car.CarVO;
	import common.AbstractBase;
	import common.exception.RentException;
	import member.Member;
	import member.MemberImpl;
	import member.MemberVO;
	import res.Reserve;
	import res.ResVO;
	
	public class RentCarApp {
		public static void main(String[] arg) {
			String memData;
			String carData;
			String resData;
			
			try {
			System.out.println("----------------------------------------------------------------------");
			//MemberVO memberVO = new MemberVO("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
			MemberVO memberVO = new MemberVO("", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
			//회원 가입 시 회원 아이디를 입력하지 않을 시
			Member member = new MemberImpl();
			member.regMember(memberVO);//회원가입
			memData = member.viewMember(memberVO);//회원 조회
			System.out.println();
			((AbstractBase)member).displaydata(memData);
			System.out.println("-----------------------------------------------------------------------");
			
			
			CarVO carVO = new CarVO("11가 1111", "소나타", "검정", 2000, "현대");
			Car car = new Car();
			car.regCarInfo(carVO);//새 차 정보 등록
			carData = car.checkCarInfo(carVO);// 차 정보 조회
			car.displaydata(carData);
			System.out.println("-----------------------------------------------------------------------");
			
			ResVO resVO = new ResVO("20220708", "11가1111", "2020-04-30", "2020-05-01", "2020-05-08");
			Reserve reserve = new Reserve();
			reserve.resCar(resVO);//렌터카 예약하기
			resData = reserve.checkResInfo(resVO);
			reserve.displaydata(resData);
			
			/*
			//회원 정보 조회
			String memberInfo = member.viewMember();
			System.out.println(memberInfo);
			
			//렌터카 정보 조회
			String carInfo = car.checkCarInfo();
			System.out.println(carInfo);
			
			//예약 정보 조회
			String resInfo = reserve.checkResInfo();
			System.out.println(resInfo);
			
			*/
			
			//회원, 차, 예약 정보 수정
			
			//회원, 차 예약 정보 삭제
			
			} catch(RentException e ) {
				System.out.println(e.getRentExceptionInfo());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
