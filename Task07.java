package by.htp.unit02.main;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		double first_radius, second_radius;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите радиус первого круга");
		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите радиус первого круга ");

		}
		first_radius = sc.nextInt();

		Scanner sb = new Scanner(System.in);

		System.out.print("Введите радиус второго круга b  ");
		while (sb.hasNextInt() == false) {
			String str;
			str = sb.next();
			System.out.println("Вы ввели '" + str + "', а нужно double значение");
			System.out.print("Введите радиус второго круга b  ");

		}
		second_radius = sb.nextInt();

		double s_first, s_second;
		s_first = Math.PI * Math.pow(first_radius, 2);
		s_second = Math.PI * Math.pow(second_radius, 2);

		if (s_first < s_second) {
			System.out.println("Площадь первого круга меньше.");
		} else if (s_first > s_second) {
			System.out.println("Площадь второго круга меньше.");
		} else {
			System.out.println("Площади кругов равны.");
		}
	}
}
