package com.syntax.groupProject;

public class Task3 {

	public static void main(String[] args) {
		
		int numbers [][] = {      
                {5, 38, 13},    
                {22, 8, 16},    
                {43, 26, 9} 		                        
             };
		int sum=0;
			for (int i=0;i<numbers.length;i+=1){
				for (int j=0;j<numbers[i].length;j++)		               	
					sum=sum+numbers[i][j];             
			}
			System.out.println(sum);
		}
	}


