package UsersMap;

public class User {

    private String firsName;
    private String secondName;
    private String patronymic;
    int birthYear;

    public User(String firsName, String secondName, String patronymic, int birthYear) {
        this.firsName = firsName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
