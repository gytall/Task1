public class TernarOperator {
	public static void main(String[] args) {
		System.out.println("Большее число - " + ternaryEvaluation(1, 2));
	}

	public static int ternaryEvaluation(int a, int b) {
		int result =(a > b) ? a : b;
		return result;
	}
}


// 5.	В Java есть вариация условного оператора – тернарный оператор "? :", принимающий три операнда и возвращающий один из них на основе значения условия. Он имеет следующую структуру:

// условие ? выражение1 : выражение2

// Ваша задача создать функцию, которая принимает два числа a и b, а затем с помощью тернарного оператора определяет, какое из чисел больше, и возвращает большее число.

// Пример: 
// ternaryEvaluation(8, 4) ➞ 8

// ternaryEvaluation(1, 11) ➞ 11

// ternaryEvaluation(5, 9) ➞ 9

