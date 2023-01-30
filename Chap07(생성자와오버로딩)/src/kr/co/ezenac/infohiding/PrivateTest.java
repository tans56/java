package kr.co.ezenac.infohiding;

class Student1 {
	String name;
	int age;
}

class Student2 {
	public String name;
	private int age;
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {	//게터
		return age;
	}
	public void setAge(int age) {	//세터
		if(age < 0 || age > 150) {	//유효성 검사 
			System.out.println("나이가 부적합 합니다.");
			this.age = 0;
			return;
		}
		this.age = age;
	}
}

public class PrivateTest {
	
	public static void main(String[] args) {
		
		Student1 student1 = new Student1();
		
		student1.name = "이순신";			//멤버변수에 직접 접근
		student1.age = -20;				//멤버변수에 직접 접근
		
		System.out.printf("%s의 나이는 %d살입니다.\n",
							student1.name , student1.age);
		
		Student2 student2 = new Student2("진도준", 21);
		student2.name = "윤현우";
		int age = student2.getAge();
		student2.setAge(-10);
		System.out.printf("%s의 나이는 %d살입니다.\n",
				student2.name , age);
		
	}
}
