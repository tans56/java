package kr.co.ezenac.exception02;

public class PasswordTest {

	private String password;
	
	public void setpassword(String password) throws PasswordException {
		
		if(password == null)
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		else if(password.length() < 8) {
			throw new PasswordException("비밀번호는 8자 이상이어야 합니다.");
	} 	else if(password.matches("[a-zA-Z]+")) {
		throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
	}
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		PasswordTest test = new PasswordTest();
		String password = null;
		
		try {
			test.setpassword(password);
			System.out.println("오류 없음1");
		} catch (PasswordException e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		password = "ezen";
		try {
			test.setpassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		password = "ezenitaca";
		try {
			test.setpassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		password = "ezenit#12";
		try {
			test.setpassword(password);
			System.out.println("오류 없음2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("프로그램 end");
	}

}






























