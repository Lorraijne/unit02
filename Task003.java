package by.htp.unit02.main;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Task003 {
	public static void main(String[]args) {
		
		double a,b;
		
		a = 1;
		b = 89;
		
		System.out.println("|  x  |   y  ");
		
		for (int h = 1; h < b; h++) {
			
			double F;
			F = 2 * Math.tan((a/2)+1);
			a++;
			double newDouble = new BigDecimal(F).setScale(1, RoundingMode.UP).doubleValue(); //гугл помог найти нужное для импорта и вывода акууратной таблицы
			
			System.out.println("| "+a+" | "+newDouble);
			
		}
	
		
		
	 }
}



