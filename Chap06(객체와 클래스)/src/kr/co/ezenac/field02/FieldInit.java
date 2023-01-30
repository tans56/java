package kr.co.ezenac.field02;

import java.util.Arrays;

public class FieldInit /*extends Object*/ {
	
	//기본형 변수
	byte byteField;				//1byte
	short shortField;			//2byte
	int intField;				//4byte
	long longField;				//8byte
	
	boolean booleanField;		//1byte
	char charField;  			//2byte
	
	float floatField;			//4
	double doubleField; 		//8
	
	//참조형 변수
	int[] arrField;				//4
	String strField;			//4
	@Override
	public String toString() {
		return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + "]";
	}
	
	
	
	
}
