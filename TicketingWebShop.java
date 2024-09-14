public class TicketingWebShop {
	public static void main(String args[]) {
		System.out.println(TicketCalc(70, 1500));
	}

	public static Object TicketCalc(int ticket, int price) {
		 final double commison = (0.72);
		 int totalCost = 0;
		 if (ticket > 0 && price > 0) {
			totalCost = (int)(ticket * price * commison);
		 } else {
			return "Неправильные значения";
		 }
		 return totalCost;
		 
	}
}


// 9.	Создайте функцию, которая принимает количество билетов на концерт, проданных через веб-сервис, и стоимость одного билета с учетом фиксированной комиссии. Функция должна вернуть общую выручку от продажи билетов.

// Пример:
// ticketSaler(70, 1500) ➞ 75600

// ticketSaler(24, 950) ➞ 16416

// ticketSaler(53, 1250) ➞ 47700

