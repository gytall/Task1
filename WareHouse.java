public class WareHouse {

	public static void main(String[] args) {
		System.out.println(containers(3, 4, 2));
		System.out.println(containers(5, 0, 2)); 
		System.out.println(containers(4, 1, 4));  
}
	public static int containers(int boxes, int bags, int barrels) {
			int itemsInBox = 20;
			int itemsInBag = 50;
			int itemsInBarrel = 100;

			int totalItems = (boxes * itemsInBox) + (bags * itemsInBag) + (barrels * itemsInBarrel);

			return totalItems;
	}
}

// 3.	В этой задаче вы управляете складом, где хранятся товары трех типов:

// - Коробки содержат по 20 товаров в каждой.
// - Мешки содержат по 50 товаров в каждом.
// - Бочки содержат по 100 товаров в каждой.

// Вам предоставили информацию о количестве каждого типа емкостей на складе, и вам нужно создать функцию, которая вернет общее количество товаров на складе, учитывая объекты хранения разных типов.

// Пример:
// containers(3, 4, 2) ➞ 460

// containers(5, 0, 2) ➞ 300

// containers(4, 1, 4) ➞ 530

