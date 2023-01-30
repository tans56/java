package kr.co.ezenac.mamber;
	
/*
 * 1. 클래스 선언
 * 		
 *  	[가시성지시자] class 클래스명 {
 * 			// 필드들
 * 			[가시성지시자] 자료형 필드명;
 * 			
 * 			// 메서드들
 * 			[가시성지시자] 반환자료형 메서드명([매개변수들...]){
 * 				// 메서드블록에 동작에 관한 내용 작성
 * 			}
 * 		}
 * 
 * 2. 클래스 사용 방법
 * 		클래스명 객체명 = new 클래스명();
 * 
 * 3. java 파일 하나에 클래스는 여러개가 있지만,
 * 	  public 클래스는 하나이고, 
 * 	  public 클래스와 .java 파일의 이름은 동일함
 * 
 * 4.클래스명
 * 		-대문자로 시작하는것이 좋음
 * 		-camel notation 방식으로 명명
 * 
 * 
 */

class A{}

public class Student {
		
	 int studentId;
	 String studentName;
	 String address;
	 
	 public void showStudentInfo() {
		 System.out.println(studentName+ " , "+ address);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
