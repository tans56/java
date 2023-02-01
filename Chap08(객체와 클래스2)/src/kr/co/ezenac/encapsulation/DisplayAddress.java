package kr.co.ezenac.encapsulation;

public class DisplayAddress {
	
	StringBuffer buffer = new StringBuffer(); 
	private String line =  "=======================================\n";
	private String title = " 이름\t   주소   \t    전화번호     \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);		
	}
	
	private void makeBody() {
		buffer.append("이순신 \t");
		buffer.append("서울 강남구 \t");
		buffer.append("010-323-1577\n");
		
		buffer.append("신사임당 \t");
		buffer.append("서울 서초구 \t");
		buffer.append("010-3123-7711\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}
	
	
}
