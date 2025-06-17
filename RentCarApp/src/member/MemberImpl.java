	package member;
	
	import common.DataUtil;
	import common.AbstractBase;
	
	public class MemberImpl extends AbstractBase implements Member	{
		String memberData;
	
		// 회원 정보 조회
		@Override
		public String viewMember(MemberVO vo) throws MemberException{
			DataUtil.decodeData(memberData);
			memberData = "회원 아이디: " + vo.id + ", " + "\n회원 비밀번호: " + vo.password + "," + "\n회원 이름: " + vo.name + ", "
					+ "\n회원 전화번호: " + vo.phoneNum;
	
			System.out.println("회원 정보를 조회합니다.");
			System.out.println("회원 조회 시간: " + showTime());
			return memberData;
		}
	
	
	
		// 회원정보 등록
		@Override
		public void regMember(MemberVO vo) throws MemberException{
			
			String id = vo.id;
			if(id == null || id.equals("")) {
				throw new MemberException("아이디는 필수 입력 정보입니다.");
			} else {
			memberData =vo.id + ", " + vo.name + ", " + vo.password + ", " + vo.phoneNum;
	
			DataUtil.encodeData(memberData);
	
			System.out.println("회원 가입합니다.");
			System.out.println("회원 가입 시간: " + showTime());
			}
		}
	
		// 회원정보 수정
		@Override
		public void modMember(MemberVO vo) throws MemberException{
			memberData = vo.id + ", " + vo.name + ", " + vo.password + ", " + vo.phoneNum;
			DataUtil.encodeData(memberData);
			
			System.out.println("\n회원정보를 수정합니다.");
			System.out.println("회원정보 수정 시간: " + showTime());
		}
	
		// 회원정보 삭제
		@Override
		public void delMember(MemberVO vo) throws MemberException{
			memberData = vo.id + ", " + vo.name + ", " + vo.password + ", " + vo.phoneNum;
			DataUtil.decodeData(memberData);
			
			System.out.println("\n\n회원정보를 삭제합니다.");
			System.out.println("회원 삭제 시간: " +showTime());
		}
	
	}
