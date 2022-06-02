package com.syntax.groupProject;

public class Task11 {

	public static void main(String[] args) {
		
		/*11. Write a program to print out duplicate elements from
           an Array of Strings? 
		 */ 
        String[] cars={"GT500", "Demon", "ZL1", "Demon", "GT500"};   
          
        for(int b=0; b<cars.length; b++) {  
            for(int c=b+1; c<cars.length; c++) {  
                if(cars[b] == cars[c])  
                    System.out.print(cars[c]+" ");  
            }  
        }   
	}

}
