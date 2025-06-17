package res;

import common.AbstractBase;
import common.DataUtil;

public class Reserve extends AbstractBase {
	String resData;

	
	//차 예약 정보 조회 가능
	public String checkResInfo(ResVO vo) {
		System.out.println("\n차 예약 정보를 조회합니다.");
		System.out.println("----------------------");
		String resInfo = "예약 번호 : " +  vo.resNumber
						+"\n예약 차 번호 : " + vo.resCarNumber
						+"\n예약일자 : " + vo.resDate
						+"\n차 사용 시작 일자 : " + vo.useBeginDate
						+"\n차 반납 예정 일자 : " + vo.useEndDate;
		System.out.println("예약 조회 시간: " + showTime());
		return resInfo;
	}
	
	//차 예약 기능
	public void resCar(ResVO vo) {
		System.out.println("차 예약 정보를 등록합니다.");
		resData = "예약 번호 : " +  vo.resNumber
				+"\n예약 차 번호 : " + vo.resCarNumber
				+"\n예약일자 : " + vo.resDate
				+"\n차 사용 시작 일자 : " + vo.useBeginDate
				+"\n차 반납 예정 일자 : " + vo.useEndDate;
		System.out.println(resData);
		System.out.println("예약 등록 시간: " + showTime());
		}
	
	//차 예약 정보 수정
	public void modResInfo(ResVO vo) {
		System.out.println("\n차 예약 정보를 수정합니다.");
		resData = "예약 번호 : " +  vo.resNumber
				+"\n예약 차 번호 : " + vo.resCarNumber
				+"\n예약일자 : " + vo.resDate
				+"\n차 사용 시작 일자 : " + vo.useBeginDate
				+"\n차 반납 예정 일자 : " + vo.useEndDate;
		System.out.println(resData);
		System.out.println("예약 수정 시간: "+ showTime());
	}
	
	//차 예약 정보 취소 기능
	public void delResInfo(ResVO vo) {
		resData = "예약 번호 : " +  vo.resNumber
				+"\n예약 차 번호 : " + vo.resCarNumber
				+"\n예약일자 : " + vo.resDate
				+"\n차 사용 시작 일자 : " + vo.useBeginDate
				+"\n차 반납 예정 일자 : " + vo.useEndDate;
		System.out.println(resData);
		System.out.println("\n\n차 예약을 취소합니다.");
		System.out.println("예약 취소 시간: "+showTime());
	}
}
