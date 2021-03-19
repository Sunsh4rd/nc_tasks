public class Main {

	public static void main(String[] args) {
		Student a = new Student("Fully", "Initialized", "Student", 10, 'c');
		Student b = new Student("Names", "And Letter", "Student", 7);
		Student c = new Student("Only", "Names", "Student");
		System.out.println(a.surname + ' ' + ' ' + a.name + ' ' + a.patronymic + ' ' + a.number + ' ' + a.letter);
		System.out.println(b.surname + ' ' + ' ' + b.name + ' ' + b.patronymic + ' ' + b.number + ' ' + b.letter);
		System.out.println(c.surname + ' ' + ' ' + c.name + ' ' + c.patronymic + ' ' + c.number + ' ' + c.letter);
	}

}

class Student {

	String surname;
	String name;
	String patronymic;
	int number;
	char letter;

	Student(String surname,	String name, String patronymic, int number, char letter) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.number = number;
		this.letter = letter;
	}

	Student(String surname,	String name, String patronymic, int number) {
		this(surname, name, patronymic, number, 'a');
	}

	Student(String surname,	String name, String patronymic) {
		this(surname, name, patronymic, 1, 'a');
	}

}