public class QuasiFitnessApp {
	public static void main(String[] args) {
		System.out.println(fitCalc(15, 2));
	}
	public static int fitCalc(int minutes, int intensity) {
		int caloriesPerMinute = 0;

		// Проверка допустимости уровня интенсивности
		if (intensity == 1) {
				caloriesPerMinute = 1;  // Низкая интенсивность
		} else if (intensity == 2) {
				caloriesPerMinute = 2;  // Средняя интенсивность
		} else if (intensity == 3) {
				caloriesPerMinute = 3;  // Высокая интенсивность
		} else {
				System.out.println("Недопустимый уровень интенсивности. Допустимые значения: 1, 2 или 3.");
				return 0;  
		}


		return minutes * caloriesPerMinute;
}

}
// 	2.	Вы пишете программу для квази-фитнес-приложения и хотите создать функцию для расчета калорий, сожженных пользователем во время тренировки. Функция должна принимать время тренировки в минутах и интенсивность, где 1 – низкая интенсивность, 2 – средняя, 3 – высокая, а затем вычислять количество сожженных калорий на основе этой информации.

// Пример:
// fitCalc(15, 1) ➞ 15

// fitCalc(24, 2) ➞ 48

// fitCalc(41, 3) ➞ 123
