public class GallonToLiterCalc {
	public static double calc(int gallons) {
		final double liters_per_gallon = 3.78541;
		return Math.round(gallons * liters_per_gallon * 1000.0) / 1000.0;
	}
	public static void main(String[] args) {
		// Примеры использования функции
		System.out.println(calc(5));
	}
}

// 1.	Создайте функцию, которая принимает целое число галлонов и преобразует его в литры.
// Пример:
// convert(5) ➞ 18.925

// convert(3) ➞ 11.355

// convert(8) ➞ 30.28
