public class Factorial {
	public static void main(String args[]) {
		System.out.println(factorial(3));
	}

	public static int factorial(int number) {
		int result = 1;
		if (number > 0) {
			for (int i = number; i > 0; i--) {
				result = result * i;
			} 
			return result;
		
		} else {
			return 0;
	}
} 
		
}


// 7.	Напишите функцию, вычисляющую факториал выбранного числа. 

// Пример:
// factorial(3) ➞ 6

// factorial(5) ➞ 120

// factorial(7) ➞ 5040
