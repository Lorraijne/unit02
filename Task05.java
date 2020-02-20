package by.htp.unit02.main;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		double a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение первого числа а ");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение первого числа а ");

		}
		a = sc.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите значение второго числа b  ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите значение второго числа b  ");

		}
		b = sb.nextInt();

		double pow_a, pow_b;
		pow_a = Math.pow(a, 2);
		pow_b = Math.pow(b, 2);

		if (pow_a > pow_b) {
			System.out.println("Наименьший квадрат равен " + pow_b);
		} else if (pow_a == pow_b) {
			System.out.println("Квадраты чисел равны.");
		} else {
			System.out.println("Наименьший квадрат равен " + pow_a);
		}

	}
}
