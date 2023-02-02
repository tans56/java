package kr.co.ezenac.global02;

public class Employee {
	
	public static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		Employee.serialNum++;
		employeeId = serialNum;
	}
	
	/*	
	 *  
	 *  인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는
	 *  인스턴스 변수를 사용할수 없음.
	 */
	public static void setSerialNum(int serialNum) {
		int i = 0;
		
		//employeeName = "kim";		//오류발생
		Employee.serialNum = serialNum;
		
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
