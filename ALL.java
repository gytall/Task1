// 1.	Создайте функцию, которая принимает целое число галлонов и преобразует его в литры.
// Пример:
// convert(5) ➞ 18.925

// convert(3) ➞ 11.355

// convert(8) ➞ 30.28

// public class GallonToLiterCalc {
// 	public static double calc(int gallons) {
// 		final double liters_per_gallon = 3.78541;
// 		return Math.round(gallons * liters_per_gallon * 1000.0) / 1000.0;
// 	}
// 	public static void main(String[] args) {
// 		// Примеры использования функции
// 		System.out.println(calc(5));
// 	}
// }

// 	2.	Вы пишете программу для квази-фитнес-приложения и хотите создать функцию для расчета калорий, сожженных пользователем во время тренировки. Функция должна принимать время тренировки в минутах и интенсивность, где 1 – низкая интенсивность, 2 – средняя, 3 – высокая, а затем вычислять количество сожженных калорий на основе этой информации.

// Пример:
// fitCalc(15, 1) ➞ 15

// fitCalc(24, 2) ➞ 48

// fitCalc(41, 3) ➞ 123




// public class QuasiFitnessApp {
// 	public static void main(String[] args) {
// 		System.out.println(fitCalc(15, 2));
// 	}
// 	public static int fitCalc(int minutes, int intensity) {
// 		int caloriesPerMinute = 0;

// 		// Проверка допустимости уровня интенсивности
// 		if (intensity == 1) {
// 				caloriesPerMinute = 1;  // Низкая интенсивность
// 		} else if (intensity == 2) {
// 				caloriesPerMinute = 2;  // Средняя интенсивность
// 		} else if (intensity == 3) {
// 				caloriesPerMinute = 3;  // Высокая интенсивность
// 		} else {
// 				System.out.println("Недопустимый уровень интенсивности. Допустимые значения: 1, 2 или 3.");
// 				return 0;  
// 		}


// 		return minutes * caloriesPerMinute;
// }

// }


// 3.	В этой задаче вы управляете складом, где хранятся товары трех типов:

// - Коробки содержат по 20 товаров в каждой.
// - Мешки содержат по 50 товаров в каждом.
// - Бочки содержат по 100 товаров в каждой.

// Вам предоставили информацию о количестве каждого типа емкостей на складе, и вам нужно создать функцию, которая вернет общее количество товаров на складе, учитывая объекты хранения разных типов.

// Пример:
// containers(3, 4, 2) ➞ 460

// containers(5, 0, 2) ➞ 300

// containers(4, 1, 4) ➞ 530

// public class WareHouse {

// 	public static void main(String[] args) {
// 		System.out.println(containers(3, 4, 2));
// 		System.out.println(containers(5, 0, 2)); 
// 		System.out.println(containers(4, 1, 4));  
// }
// 	public static int containers(int boxes, int bags, int barrels) {
// 			int itemsInBox = 20;
// 			int itemsInBag = 50;
// 			int itemsInBarrel = 100;

// 			int totalItems = (boxes * itemsInBox) + (bags * itemsInBag) + (barrels * itemsInBarrel);

// 			return totalItems;
// 	}
// }



// 4.	Создайте функцию, которая принимает 3 числа: X, Y и Z. Эти числа представляют длины сторон треугольника. Функция должна вернуть тип треугольника на основе данных сторон: "равносторонний" (если все стороны равны), "равнобедренный" (если две стороны равны), "разносторонний" (если все стороны разные) или "не является треугольником" (если невозможно построить треугольник с заданными сторонами).

// Пример:
// triangleType(5, 5, 5) ➞ isosceles

// triangleType(5, 4, 5) ➞ equilateral

// triangleType(3, 4, 5) ➞ different-sided

// triangleType(5, 1, 1) ➞ not a triangle

// public class TriangleType {

// 	public static void main(String[] args) {
// 			System.out.println(triangleType(5, 5, 5));  
// 			System.out.println(triangleType(5, 4, 5));  
// 			System.out.println(triangleType(3, 4, 5));  
// 			System.out.println(triangleType(5, 1, 1));  
// 	}

// 	public static String triangleType(int X, int Y, int Z) {
// 			if (X <= 0 || Y <= 0 || Z <= 0) {
// 					return "Стороны треугольника должны быть положительными числами";
// 			}

// 			if (X + Y > Z && X + Z > Y && Z + Y > X) {
// 					if (X == Y && Y == Z) {
// 							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") равносторонний.";
// 					} else if (X == Y || X == Z || Y == Z) {
// 							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") равнобедренный.";
// 					} else {
// 							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") разносторонний.";
// 					}
// 			} else {
// 					return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") не является треугольником.";
// 			}
// 	}
// }



// 5.	В Java есть вариация условного оператора – тернарный оператор "? :", принимающий три операнда и возвращающий один из них на основе значения условия. Он имеет следующую структуру:

// условие ? выражение1 : выражение2

// Ваша задача создать функцию, которая принимает два числа a и b, а затем с помощью тернарного оператора определяет, какое из чисел больше, и возвращает большее число.

// Пример: 
// ternaryEvaluation(8, 4) ➞ 8

// ternaryEvaluation(1, 11) ➞ 11

// ternaryEvaluation(5, 9) ➞ 9

// public class TernarOperator {
// 	public static void main(String[] args) {
// 		System.out.println("Большее число - " + ternaryEvaluation(1, 2));
// 	}

// 	public static int ternaryEvaluation(int a, int b) {
// 		int result =(a > b) ? a : b;
// 		return result;
// 	}
// }



// 6.	У меня есть ограниченное количество ткани определенной длины, и я хочу сшить как можно больше пододеяльников. Создайте функцию, которая будет принимать длину ткани (в метрах) и размер одной детали (ширина и длина в метрах), а затем возвращать количество пододеяльников, которые я смогу сшить, прежде чем кончится рулон.

// n * 2 – это количество квадратных метров имеющейся ткани,
// w и h – это длина и ширина одной детали в метрах

// Пример:
// howManyItems(22, 1.4, 2) ➞ 3

// howManyItems(45, 1.8, 1.9) ➞ 6

// howManyItems(100, 2, 2) ➞ 12


// Примечание:
// - Не считайте пододеяльник, если на него не хватило ткани в рулоне


// public class FabricCloth {
// 	public static void main(String args[]) {
// 		System.out.println(howManyItems(22, 1.4, 2));
// 	}
// 	public static Object howManyItems(double totalMaterial, double width, double height) {
// 		if (totalMaterial <= 0 || width <= 0 || height <= 0) {
// 				return "неверные данные"; 
// 		}

// 		double itemArea = width * height;

// 		int maxBlankets = (int) totalMaterial / (int) itemArea;

// 		while ((maxBlankets + 1) * itemArea > totalMaterial) {
// 				maxBlankets--;
// 		}

// 		return maxBlankets;
// }
// }



// 7.	Напишите функцию, вычисляющую факториал выбранного числа. 

// Пример:
// factorial(3) ➞ 6

// factorial(5) ➞ 120

// factorial(7) ➞ 5040



// public class Factorial {
// 	public static void main(String args[]) {
// 		System.out.println(factorial(7));
// 	}

// 	public static Object factorial(int number) {
// 		int result = 1;
// 		if (number > 0) {
// 			for (int i = number; i > 0; i--) {
// 				result = result * i;
// 			} 
// 			return result;
		
// 		} else if (number == 0) {
// 			return 1;
// 		} else {
// 			return "Недопустимое значение";
// 		}	
// } 
		
// }


// 8.	Создайте функцию, которая находит наибольший общий делитель двух чисел.

// Пример: 
// gcd(48, 18) ➞ 6

// gcd(52, 8) ➞ 4

// gcd(259, 28) ➞ 1



// public class GreatestCommonDivisor {
// 	public static void main(String args[]) {
// 		System.out.println(gcd(18, 0));
// 	}

// 	public static int gcd(int a, int b) {
// 		while (b != 0) {
// 				int temp = b;
// 				b = a % b; 
// 				a = temp; 
// 		}
// 		return a; 
// }

// }




// 9.	Создайте функцию, которая принимает количество билетов на концерт, проданных через веб-сервис, и стоимость одного билета с учетом фиксированной комиссии. Функция должна вернуть общую выручку от продажи билетов.

// Пример:
// ticketSaler(70, 1500) ➞ 75600

// ticketSaler(24, 950) ➞ 16416

// ticketSaler(53, 1250) ➞ 47700




// public class TicketingWebShop {
// 	public static void main(String args[]) {
// 		System.out.println(TicketCalc(70, 1500));
// 	}

// 	public static Object TicketCalc(int ticket, int price) {
// 		 final double commison = (0.72);
// 		 int totalCost = 0;
// 		 if (ticket > 0 && price > 0) {
// 			totalCost = (int)(ticket * price * commison);
// 		 } else {
// 			return "Неправильные значения";
// 		 }
// 		 return totalCost;
		 
// 	}
// }




// 10.	Создайте функцию, которая принимает целое число студентов и количество парт в аудитории. Функция должна определить, сколько столов не хватает для размещения всех студентов, если за одним столом помещается два студента.

// Пример: 
// tables(5, 2) ➞ 1

// tables(31, 20) ➞ 0

// tables(123, 58) ➞ 4



// public class University {
// 	public static void main(String args[]) {
// 		System.out.println(TableCalc(13, 7));
// 	}
// 	public static int TableCalc(int student, int desk) {
// 		int tables = 0;
// 		int needTables = ((student + 1)  / 2);
// 		while (needTables > desk) {
// 			return needTables - desk;
// 		}
// 		return tables;
// 	}

// }