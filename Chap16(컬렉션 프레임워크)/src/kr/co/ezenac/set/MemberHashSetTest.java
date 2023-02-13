package kr.co.ezenac.set;

import kr.co.ezenac.list.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		memberHashSet.addMember(memberL);
		memberHashSet.addMember(memberW);
		memberHashSet.addMember(memberR);
		memberHashSet.addMember(memberS);
		memberHashSet.showAllMembers();
		
		//아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의
		//equals()와 hashCode() 메서드를 재정의 해야함
		Member memberJ = new Member(2025, "진도준");			//2025 아이디 중복
		memberHashSet.addMember(memberJ);
		memberHashSet.showAllMembers();
		
	}
}


















