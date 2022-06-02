package com.syntax.class08;

public class HW3 {public static void main(String [] args) {
	/*Using nested loop, 
	 * create a 24 hour clock that will display 2 digits for an hour and 2 digits for a minute.
       Example:
		10:00
		10:01
		10:02
		…..etc
		10:59
		11:00
		……etc
	 	*/
	int h;
	int m;
	for(h=0; h<=23; h++) {
		for(m=0; m<=59; m++) {
			System.out.println(h+":"+m);
		}
	}
	
}

}
