package by.htp.unit02.main;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		int a, b, c, d;

		Scanner sa = new Scanner(System.in);

		System.out.print("Введите а ");
		while (sa.hasNextInt() == false) {
			String str;
			str = sa.next();
			System.out.println("Вы ввели '" + str + "', а нужно int значение");
			System.out.print("Введите а ");

		}
		a = sa.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите b ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно int значение");
			System.out.print("Введите b ");

		}
		b = sb.nextInt();

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите c ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно int значение");
			System.out.print("Введите c ");

		}
		c = sc.nextInt();

		Scanner sd = new Scanner(System.in);

		System.out.print("Введите c ");
		while (sd.hasNextInt() == false) {
			String str;
			str = sd.next();
			System.out.println("Вы ввели '" + str + "', а нужно int значение");
			System.out.print("Введите cd ");

		}

		d = sd.nextInt();

		int firstP = 0;

		firstP = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("Значение функции равно " + firstP);
	}
}
