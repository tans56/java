package kr.co.ezenac.set02;

public class Member implements Comparable<Member>{

	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	public Member(int memberId, String memberName) {
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다."; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;		//downcasting
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
			return false;
	}
	@Override
	public int hashCode() {
		return memberId;
	}
	
	// 컬렉션에 있는것과 파라미터로 넘어오는 것 비교하여
	// 내것이 크면 양수 반환, 적으면 음수 반환, 같으면 0 반환
	@Override
	public int compareTo(Member member) {
		
		if(this.memberId > member.memberId)
			return 1;									//오름차순, 내림차순 정령(-1;)
		if(this.memberId < member.memberId)
			return -1;
		else return 0;
	}
}
