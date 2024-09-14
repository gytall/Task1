public class GreatestCommonDivisor {
	public static void main(String args[]) {
		System.out.println();
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
				int temp = b;
				b = a % b; 
				a = temp; 
		}
		return a; 
}

}



// 8.	Создайте функцию, которая находит наибольший общий делитель двух чисел.

// Пример: 
// gcd(48, 18) ➞ 6

// gcd(52, 8) ➞ 4

// gcd(259, 28) ➞ 1

