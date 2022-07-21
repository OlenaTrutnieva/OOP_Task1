package by.training.exproject.main;

import java.util.Random;

import by.training.exproject.task1.Task1;

//Создайте класс Test1 двумя переменными. 
//Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Main {
	public static void main(String[] args) {
		Task1 number1;
		Task1 number2;
		int sum;
		
		number1 = init1();
		number2 = init2();
		
		sum = sum(number1, number2);
		
		System.out.println("Number1 =" + number1.x1);
		System.out.println("Number2 =" + number2.x2);
		System.out.println("Sum of Number1 and Number2 =" + sum);
		
		compare(number1, number2);
		
	}
	
	public static Task1 init1() {
		Task1 x1 = new Task1();
		x1.x1 = 10;
		return x1;
	}
	
	public static Task1 init2() {
		Task1 x2 = new Task1();
		x2.x2 = 10;
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
	
}
