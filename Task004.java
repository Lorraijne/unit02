package by.htp.unit02.main;

import java.util.Scanner;

public class Task004 {
	public static void main(String[]args) {
		
		double x = 7;
		double function;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Введите значение аргумента ");
		while(sc.hasNextInt() == false) {
			String str;
		      str = sc.next();
		      System.out.println("Вы ввели '" + str + "', а нужно double значение");
		      System.out.print("Введите значение аргумента ");
		      
		    }
		    x = sc.nextInt();
		
		if (x <= -3 ) {
			
			function = 9;
			 System.out.print("Function = "+function);
			
			
		} else if (Math.pow(x, 2) + 1 == 0){
			
			 System.out.print("Нет решений");
			 
		} else if ( x > 3 ) {
			
			function = 1/(Math.pow(x, 2) + 1 );
			System.out.print("Function = "+function);
			
		} else if ( x < 3 && x > - 3) {
			System.out.print("Нет решений");
		}
		
	 }
}



