public class Factorial {
	public static void main(String args[]) {
		System.out.println(factorial(7));
	}

	public static Object factorial(int number) {
		int result = 1;
		if (number > 0) {
			for (int i = number; i > 0; i--) {
				result = result * i;
			} 
			return result;
		
		} else if (number == 0) {
			return 1;
		} else {
			return "Недопустимое значение";
		}	
} 
		
}


// 7.	Напишите функцию, вычисляющую факториал выбранного числа. 

// Пример:
// factorial(3) ➞ 6

// factorial(5) ➞ 120

// factorial(7) ➞ 5040
