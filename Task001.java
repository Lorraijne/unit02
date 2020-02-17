package by.htp.unit02.main;

import java.util.Scanner;

public class Task001 {
	public static void main(String[]args) {
		
	int a = 1, b = 2;

			if (a < b)	  {
				System.out.println("7");
			} else {
				System.out.println("8");
			}
			
			if (a<b) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			
			Scanner sc = new Scanner(System.in); 
			
			int x;

			System.out.print("> ");
			while(sc.hasNextInt() == false) {
				String str;
			      str = sc.next();
			      System.out.println("Вы ввели '" + str + "', а нужно int значение");
			      System.out.print("> ");
			      
			    }
			    x = sc.nextInt();
			    
			if (x > 3 ) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
			  
			
		
	 }
}



