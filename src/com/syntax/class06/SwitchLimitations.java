package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		
		/*switch can work with byte, short, int, char, String
		 *
		 *switch has a data type limitations
		 *
		 *switch cannot work with double float, long, boolean
		 */
		
		double price=10;
		
		/* switch (price) {->Compiler Error: Cannot switch on a value of type double.
		 * }
		 */
		
		boolean hungry=true;
		
		/*
		 * switch(hungry) {->CE:Cannot switch on a value of type boolean. 
		 * }
		 */
		
		/*
		 * switch has operators limitations
		 * cannot use logical operators inside switch
		 */
		
		char choice='Y';
		String meaning;
		
		/*switch(choice) {
		case 'Y' || 'y':
			meaning="Yes";
			break;
		}
		*/
		
		int day=5;
		/*switch() {
		case>5:
		}*/
		
		}
		
		}

	


