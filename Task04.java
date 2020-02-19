package by.htp.unit02.main;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		double a, b, c, x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение первого коэффициента а ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение первого коэффициента а  ");

		}
		a = sc.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите значение второго коэффициента b  ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение второго коэффициента b  ");

		}
		b = sb.nextInt();

		Scanner st = new Scanner(System.in);

		System.out.print("Введите значение константы ");
		while (st.hasNextInt() == false) {
			String str;
			str = st.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение константы ");

		}
		c = st.nextInt();

		Scanner se = new Scanner(System.in);

		System.out.print("Введите значение аргумента ");
		while (se.hasNextInt() == false) {
			String str;
			str = se.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение аргумента");

		}
		x = se.nextInt();

		double result;

		result = Math.abs(a * x * x + b * x + c);

		System.out.println("Решение квадратного уравнения:  " + result);

	}
}
