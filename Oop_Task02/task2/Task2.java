package by.training.exproject.task2;

// Создйте класс Test2 двумя переменными. 
// Добавьте конструктор с входными параметрами. 
// Добавьте конструктор, инициализирующий члены класса по умолчанию. 
// Добавьте set- и get- методы для полей экземпляра класса.

public class Task2 {

	private String animal;
	private String color;
	private String name;
	private boolean biting;
	
	public Task2(String a, String c, String n, boolean b){
		animal = a;
		color = c;
		name = n;
		biting = b;
	}
	

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String _animal) {
		animal = _animal;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String _color) {
		color = _color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}
	
	public boolean getBiting() {
		return biting;
	}

	public void setBiting(boolean _biting) {
		biting = _biting;
	}
}
