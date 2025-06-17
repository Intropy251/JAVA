package member;

public interface Member  {
	public String viewMember(MemberVO vo) throws MemberException;	//회원 등록 메서드
	
	public void regMember(MemberVO vo) throws MemberException;	//회원 정보 조회 메서드
	
	public void modMember(MemberVO vo) throws MemberException;	//회원 정보 수정 메서드
	
	public void delMember(MemberVO vo) throws MemberException;	//회원 정보 삭제 메서드

	

}
