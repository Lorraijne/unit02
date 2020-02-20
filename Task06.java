package by.htp.unit02.main;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		double first, second, third;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите длину первой стороны а ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите длину первой стороны а ");

		}
		first = sc.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите длину второй стороны b  ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите длину второй стороны b  ");

		}
		second = sb.nextInt();

		Scanner sa = new Scanner(System.in);

		System.out.print("Введите длину третьей стороны c ");
		while (sa.hasNextInt() == false) {
			String str;
			str = sa.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите длину третьей стороны c ");

		}
		third = sa.nextInt();

		if (first == second && second == third) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник НЕ равносторонний");
		}
	}
}
