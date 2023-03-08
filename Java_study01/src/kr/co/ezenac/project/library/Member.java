package kr.co.ezenac.project.library;

import java.util.ArrayList;

import kr.co.ezenac.project.util.Constants;

public class Member {
	
	public static int num = 1000;	
	private int memberId;
	private String memberName;
	private int Age;
	private int grade;
	private ArrayList<Borrow> borrow = new ArrayList<>();
	
	public Member(String memberName, int Age) {
		this.memberName = memberName;
		this.Age = Age;
		memberId = ++num;
		
		if(memberId == 1001) {
			grade = Constants.PLATINUM;
			System.out.println("선착순 이벤트!!");
			System.out.println(memberName + "님은 PLATINUM 등급입니다.");
			System.out.println();
		} else if(memberId >= 1002 && memberId <= 1004) {
			grade = Constants.GOLD;
			System.out.println("선착순 이벤트!!");
			System.out.println(memberName + "님은 GOLD 등급입니다.");
			System.out.println();
		} else {
			grade = Constants.SILVER;
			System.out.println("선착순 이벤트!!");
			System.out.println(memberName + "님은 SILVER 등급입니다.");
			System.out.println();
		}
			
	}

	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public int getAge() {
		return Age;
	}

	public int getGrade() {
		return grade;
	}

	public ArrayList<Borrow> getBorrow() {
		return borrow;
	}
	
	public void addborrow(Borrow b) {
		borrow.add(b);
	}
}
