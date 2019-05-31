package APrimeNumber;

import java.util.ArrayList;

public class APrimeNumber {
 private int result;
 private ArrayList<Boolean> val = new ArrayList<>();
 private String hey = "no";
 public void primeCal() {
	 for(int i = 7; i < 50; i++) {
		 
		 if(i >= 7 && i <10 ) {
			 if(i == 7) {
				 System.out.println(7);
			 }
		 }
		 else {
			 hey = "no";
			 result = (int) Math.sqrt(i);
			 for(int j =2; j <= result  ; j ++) {
				 if(i % j == 0) {
					 hey = "yes";
				 }
			 }
			 if(hey.equals("no")) {
				 System.out.println(i);				
			 }
		 }
		
	 }
 }
}
