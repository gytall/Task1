public class TriangleType {

	public static void main(String[] args) {
			System.out.println(triangleType(5, 5, 5));  
			System.out.println(triangleType(5, 4, 5));  
			System.out.println(triangleType(3, 4, 5));  
			System.out.println(triangleType(5, 1, 1));  
	}

	public static String triangleType(int X, int Y, int Z) {
			if (X <= 0 || Y <= 0 || Z <= 0) {
					return "Стороны треугольника должны быть положительными числами";
			}

			if (X + Y > Z && X + Z > Y && Z + Y > X) {
					if (X == Y && Y == Z) {
							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") равносторонний.";
					} else if (X == Y || X == Z || Y == Z) {
							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") равнобедренный.";
					} else {
							return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") разносторонний.";
					}
			} else {
					return "Треугольник со сторонами (" + X + ", " + Y + ", " + Z + ") не является треугольником.";
			}
	}
}

// 4.	Создайте функцию, которая принимает 3 числа: X, Y и Z. Эти числа представляют длины сторон треугольника. Функция должна вернуть тип треугольника на основе данных сторон: "равносторонний" (если все стороны равны), "равнобедренный" (если две стороны равны), "разносторонний" (если все стороны разные) или "не является треугольником" (если невозможно построить треугольник с заданными сторонами).

// Пример:
// triangleType(5, 5, 5) ➞ isosceles

// triangleType(5, 4, 5) ➞ equilateral

// triangleType(3, 4, 5) ➞ different-sided

// triangleType(5, 1, 1) ➞ not a triangle
