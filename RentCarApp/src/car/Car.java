package car;

import common.DataUtil;
import common.AbstractBase;

public class Car extends AbstractBase {
	String carData;
	
	//생성자
	public Car() {
		
	}
	
	public Car(CarVO vo) {
		
	}
	
	//차 정보 조회
	public String checkCarInfo(CarVO vo) {
		System.out.println("\n렌터카 정보를 조회합니다.");
		System.out.println("---------------------------");
		String carInfo = "차 번호: " + vo.carNumber
						+"\n차 이름: " + vo.carName
						+"\n차 색상: " + vo.carColor
						+"\n차 크기: " + vo.carSize
						+"\n차 제조사: " + vo.carMaker;
		return carInfo;
	}
	
	//차 정보 등록
	public void regCarInfo(CarVO vo) {
		System.out.println("차 정보를 등록합니다.");
		carData = "차 번호: " + vo.carNumber
				+"\n차 이름: " + vo.carName
				+"\n차 색상: " + vo.carColor
				+"\n차 크기: " + vo.carSize
				+"\n차 제조사: " + vo.carMaker;
		DataUtil.encodeData(carData);
		System.out.println("차 등록 시간: " + showTime());
	}
	
	//차 정보 수정
	public void modCarInfo(CarVO vo) 	{
		System.out.println("\n렌터카 정보를 수정합니다.");
		carData = "차 번호: " + vo.carNumber
				+"\n차 이름: " + vo.carName
				+"\n차 색상: " + vo.carColor
				+"\n차 크기: " + vo.carSize
				+"\n차 제조사: " + vo.carMaker;
		DataUtil.encodeData(carData);
		System.out.println(carData);
		System.out.println("차 정보 수정 시간: " + showTime());
	}
	
	//차 정보 삭제
	public void delCarInfo(CarVO vo) 	{
		carData = "차 번호: " + vo.carNumber
				+"\n차 이름: " + vo.carName
				+"\n차 색상: " + vo.carColor
				+"\n차 크기: " + vo.carSize
				+"\n차 제조사: " + vo.carMaker;
		DataUtil.decodeData(carData);
		
		System.out.println("\n\n렌터카 정보를 삭제합니다.");
		System.out.println("차 정보 삭제 시간: "+ showTime());
	}

}
