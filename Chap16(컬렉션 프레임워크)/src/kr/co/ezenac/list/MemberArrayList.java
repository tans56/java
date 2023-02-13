package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.Iterator;

// Member 클래스로 생성된 인스턴스를 관리하는 클래스를 컬렉션 프레임워크 클래스 활용하여 구현함

public class MemberArrayList {

	private ArrayList<Member> arrayList;			//arrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();				//멤버로 선언된 arrayList 생성
	}
	
	public void addMember(Member member) {
		//ArrayList에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		 //해당 아이디를 가진 멤버를 ArrayaList에서 찾음
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			//멤버 아이디(getMemberId())가 매개변수 memberId와 일치하면
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				// 해당 멤버 삭제
//				arrayList.remove(i);
//				return true;			//true 반환	
//			}
//		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				// 해당 멤버 삭제
				arrayList.remove(member);
				return true;
		}
		}	
		
		
		//for가 끝날때까지 return이 안된 경우
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for(Member member : arrayList) 
			System.out.println(member);
		System.out.println();
	}
}
