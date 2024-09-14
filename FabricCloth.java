public class FabricCloth {
	public static void main(String args[]) {
		System.out.println(howManyItems(22, 1.4, 2));
	}
	public static Object howManyItems(double totalMaterial, double width, double height) {
		if (totalMaterial <= 0 || width <= 0 || height <= 0) {
				return "неверные данные"; 
		}

		double itemArea = width * height;

		int maxBlankets = (int) totalMaterial / (int) itemArea;

		while ((maxBlankets + 1) * itemArea > totalMaterial) {
				maxBlankets--;
		}

		return maxBlankets;
}
}



// 6.	У меня есть ограниченное количество ткани определенной длины, и я хочу сшить как можно больше пододеяльников. Создайте функцию, которая будет принимать длину ткани (в метрах) и размер одной детали (ширина и длина в метрах), а затем возвращать количество пододеяльников, которые я смогу сшить, прежде чем кончится рулон.

// n * 2 – это количество квадратных метров имеющейся ткани,
// w и h – это длина и ширина одной детали в метрах

// Пример:
// howManyItems(22, 1.4, 2) ➞ 3

// howManyItems(45, 1.8, 1.9) ➞ 6

// howManyItems(100, 2, 2) ➞ 12


// Примечание:
// - Не считайте пододеяльник, если на него не хватило ткани в рулоне
