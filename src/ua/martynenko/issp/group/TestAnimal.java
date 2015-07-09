package ua.martynenko.issp.group;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal[] mass = {new Cat(), new Dog()};
		for (Animal string : mass) {
			System.out.println(string.voice());
		}
	}
}
