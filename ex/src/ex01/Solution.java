package ex01;

import java.util.Arrays;

public class Solution {
	
	
	
    public int solution(String my_string) {
    	my_string = "aAb1B2cC34oOp";
        return Arrays.stream(my_string.replaceAll("[a-z|A-Z","").split(""))
        					.mapToInt(Integer::parseInt).sum();
    }
	
    public static void main(String[] args) {
    	String my_string = "aAb1B2cC34oOp";
         Arrays.stream(my_string.replaceAll("[a-z|A-Z]","").split(""))
        					.mapToInt(Integer::parseInt).sum();
         
         
	}
    
}
