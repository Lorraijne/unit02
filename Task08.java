package by.htp.unit02.main;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		double first_side, second_side, third_side;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первую сторону первого треугольника ");
		while (sc.hasNextFloat() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите первую сторону первого треугольника ");

		}
		first_side = sc.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите вторую сторону первого треугольника ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите вторую сторону первого треугольника ");

		}
		second_side = sb.nextInt();

		Scanner sy = new Scanner(System.in);

		System.out.print("Введите третью сторону первого треугольника ");
		while (sy.hasNextInt() == false) {
			String str;
			str = sy.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите третью второго круга b  ");

		}
		third_side = sy.nextInt();

		double first_s = 0;
		double first_pp;

		first_pp = (first_side + second_side + third_side) / 2;

		if (first_side + second_side > third_side || first_side + third_side > second_side
				|| second_side + third_side > first_side) { // существует ли такой треугольник
			
			if (first_side == second_side && second_side == third_side) { // является ли треугольник равносторонним

				first_s = (Math.sqrt(3) * Math.pow(first_side, 2)) / 4;
				System.out.println(first_s);
			} else {
				first_s = Math.sqrt(first_pp * (first_pp - first_side) * (first_pp - second_side) * (first_pp - third_side)); // площадь
																														// через
																														// полупериметр
			}

		} else {
			System.out.println("Первого треугольника не существует, попробуйте заново.");
			System.exit(0);
		}

		double ch_first_side, ch_second_side, ch_third_side;

		Scanner scc = new Scanner(System.in);

		System.out.print("Введите первую сторону второго треугольника ");
		while (scc.hasNextInt() == false) {
			String str;
			str = scc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите первую сторону вторую треугольника ");

		}
		ch_first_side = scc.nextInt();

		Scanner sbb = new Scanner(System.in);

		System.out.print("Введите вторую сторону второго треугольника ");
		while (sbb.hasNextInt() == false) {
			String str;
			str = sbb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите вторую сторону второго треугольника ");

		}
		ch_second_side = sbb.nextInt();

		Scanner syy = new Scanner(System.in);

		System.out.print("Введите третью сторону второго треугольника ");
		while (syy.hasNextInt() == false) {
			String str;
			str = syy.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите третью сторону второго треугольника ");

		}
		ch_third_side = syy.nextInt();

		double ch_first_s = 0;
		double ch_first_pp;

		ch_first_pp = (ch_first_side + ch_second_side + ch_third_side) / 2;

		if (ch_first_side + ch_second_side > ch_third_side || ch_first_side + ch_third_side > ch_second_side
				|| ch_second_side + ch_third_side > ch_first_side) { // существует ли такой треугольник

			if (ch_first_side == ch_second_side && ch_second_side == ch_third_side) { // является ли треугольник
																						// равносторонним

				ch_first_s = (Math.sqrt(3) * Math.pow(ch_first_side, 2)) / 4;
			} else {
				ch_first_s = Math.sqrt(ch_first_pp * (ch_first_pp - ch_first_side) * (ch_first_pp - ch_second_side)
						* (ch_first_pp - ch_third_side)); // площадь через полупериметр
			}

		} else {
			System.out.println("Первого треугольника не существует, попробуйте заново.");
			System.exit(0);
		}
		
		if (first_s > ch_first_s ) {
			System.out.println("Площадь первого треугольника больше.");
		}else if (first_s == ch_first_s) {
			System.out.println("Площади треугольников равны.");
		}else {
			System.out.println("Площадь второго треугольника больше.");
		}
		
		
	}
}
