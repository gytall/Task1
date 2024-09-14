public class University {
	public static void main(String args[]) {
		System.out.println(TableCalc(13, 7));
	}
	public static int TableCalc(int student, int desk) {
		int tables = 0;
		int needTables = ((student + 1)  / 2);
		while (needTables > desk) {
			return needTables - desk;
		}
		return tables;
	}

}






// 10.	Создайте функцию, которая принимает целое число студентов и количество парт в аудитории. Функция должна определить, сколько столов не хватает для размещения всех студентов, если за одним столом помещается два студента.

// Пример: 
// tables(5, 2) ➞ 1

// tables(31, 20) ➞ 0

// tables(123, 58) ➞ 4
