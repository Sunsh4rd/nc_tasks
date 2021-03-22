import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] grades = {2,3,4,5};
		Student a = new Student("Fully", "Initialized", "Student", 10, 'c', grades);
		int[] g = a.getGrades();
		g[0] = 5;
		for (int gr: a.getGrades()) {
			System.out.println(gr);
		}
		a.setGrades(g);
		for (int gr: a.getGrades()) {
			System.out.println(gr);
		}
	}
}

class Student {

	private final String surname;
	private final String name;
	private final String patronymic;
	private int number;
	private char letter;
	private int[] grades;

	Student(String surname,	String name, String patronymic, int number, char letter, int[] grades) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.number = number;
		this.letter = letter;
		setGrades(grades);
	}

	Student(String surname,	String name, String patronymic, int number) {
		this(surname, name, patronymic, number, 'a', new int[]{2});
	}

	Student(String surname,	String name, String patronymic) {
		this(surname, name, patronymic, 1, 'a', new int[]{2});
	}

	String getSurname() {
		return this.surname;
	}

	String getName() {
		return this.name;
	}

	String getPatronymic() {
		return this.patronymic;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getNumber() {
		return this.number;
	}

	void setLetter(char letter) {
		this.letter = letter;
	}

	int getLetter() {
		return this.letter;
	}

	void setGrades(int[] grades) {
		for (int g : grades) {
			if (g < 2 || g > 5) {
				throw new IllegalArgumentException();
			}
		}
		this.grades = Arrays.copyOf(grades, grades.length);
	}

	int[] getGrades() {
		return Arrays.copyOf(this.grades, this.grades.length);
	}
}