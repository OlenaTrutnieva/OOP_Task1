package by.training.exproject.task1;

// Создайте класс Test1 двумя переменными. 
// Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Task1 {
	private int x1;
	private int x2;
	
	
	public Task1() {
		x1 = 0;
		x2 = 0;
	}
	
	public void setX1(int _x1) {
		x1 = _x1;
	}

	public int getX1() {
		return x1;
	}
	
	public void setX2(int _x2) {
		x2 = _x2;
	}

	public int getX2() {
		return x2;
	}
	
	public static Task1 init1() {
		Task1 x1 = new Task1();
		x1.setX1(10);
		return x1;
	}
	
	public static Task1 init2() {
		Task1 x2 = new Task1();
		x2.setX2(20);
		return x2;
	}
	
	public static int sum(Task1 y1, Task1 y2) {
		Task1 x1;
		Task1 x2;
		int a;
		
		x1 = init1();
		x2 = init2();
		a = x1.x1 + x2.x2;
		
		return a;
	}
	
	
	public static void compare(Task1 y1, Task1 y2) {
		Task1 x1;
		Task1 x2;
		
		x1 = init1();
		x2 = init2();
		
		if (x1.x1 > x2.x2) {
			System.out.println("Number1 is greater then Number2");
		}
		else if (x2.x2 > x1.x1) {
			System.out.println("Number2 is greater then Number1");
		}
		else {
			System.out.println("Number1 equals Number2");
		}
		
		
	}
	
	public static void main(String[] args) {
		Task1 number1 = new Task1();
		Task1 number2 = new Task1();
		int sum;
		
		number1 = init1();
		number2 = init2();
		sum = sum(number1, number2);
		
		System.out.println("Number1 =" + number1.x1);
		System.out.println("Number2 =" + number2.x2);
		System.out.println("Sum of Number1 and Number2 =" + sum);
		
		compare(number1, number2);
		
	}
	
}