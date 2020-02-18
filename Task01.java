package by.htp.unit02.main;

import java.util.Scanner;

public class Task01 {
public static void main(String[]args) {
	
	  double a, b;
	  
	  Scanner sc = new Scanner(System.in); 
		
		System.out.print("Введите значение первого числа ");
		while(sc.hasNextInt() == false) {
			String str;
		      str = sc.next();
		      System.out.println("Вы ввели '" + str + "', а нужно double значение");
		      System.out.print("Введите значение первого числа ");
		      
		    }
		    a = sc.nextInt();
		    
		    Scanner sb = new Scanner(System.in); 
			
			System.out.print("Введите значение второго числа ");
			while(sb.hasNextInt() == false) {
				String str;
			      str = sb.next();
			      System.out.println("Вы ввели '" + str + "', а нужно double значение");
			      System.out.print("Введите значение второго числа ");
			      
			    }
			    b = sb.nextInt();
		  
		  if ( a > b ) {
			  System.out.print("Первое число "+a+" больше второго "+b);
		  } else if (a < b) {
			  System.out.print("Первое число "+a+" меньше второго "+b);
		  } else if (a == b) {
			  System.out.print("Первое число "+a+" равно второму "+b);
		  }
		    
		    
		    
		    
 }
}
