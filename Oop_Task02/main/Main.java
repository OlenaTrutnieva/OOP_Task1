package by.training.exproject.main;

import by.training.exproject.task2.Task2;

//Создйте класс Test2 двумя переменными. 
//Добавьте конструктор с входными параметрами. 
//Добавьте конструктор, инициализирующий члены класса по умолчанию. 
//Добавьте set- и get- методы для полей экземпляра класса.

public class Main {

	public static void main(String[] args) {
		Task2 cat;

		cat = init();
		
		System.out.println("Type of animal: " + cat.getAnimal());
		System.out.println("Color of animal: " + cat.getColor());
		System.out.println("Name of the animal: " + cat.getName());
		System.out.println("Is it biting? : " + cat.getBiting());
		

	}

	public static Task2 init() {

		Task2 cat = new Task2("adfa","adaf","affaf",true);

		cat.setAnimal("Cat");
		cat.color = "Red";
		cat.name = "Fisher";
		cat.biting = true;

		return cat;
	}

}
