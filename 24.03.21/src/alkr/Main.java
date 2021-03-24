package alkr;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

//        КлонируемоеОружие клонируемоеОружие = new КлонируемоеОружие("что-то старое");
//        Клон боббаФет = new Клон("зеленый", клонируемоеОружие, 1);
//        Клон клон = боббаФет.clone();
//        клонируемоеОружие.setName("что-то новое");
//        System.out.println(боббаФет.getОружие().getName());
//        System.out.println(клон.getОружие().getName());

        Car car1 = new Car("toyota", new Color(1, "red"), 2000);
        Car car2 = new Car("toyota", new Color(1, "red"), 2000);

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}

//class Клон implements Cloneable {
//    private String цвет;
//    private Оружие оружие;
//    private int номер;
//
//    public Клон(String цвет, Оружие оружие, int номер) {
//        this.цвет = цвет;
//        this.оружие = оружие;
//        this.номер = номер;
//    }
//
//    public Оружие getОружие() {
//        return оружие;
//    }
//
//    @Override
//    public Клон clone() throws CloneNotSupportedException {
//
//        return (Клон) super.clone();
//    }
//}
//
//class КлонируемоеОружие implements Cloneable, Оружие {
//    private String name;
//
//    public КлонируемоеОружие(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public Оружие clone() throws CloneNotSupportedException {
//        System.out.println("Клонирую оружие");
//        return (Оружие) super.clone();
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//class НеКлонируемоеОружие implements Оружие {
//    private String name;
//
//    public НеКлонируемоеОружие(String name) {
//        this.name = name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//interface Оружие {
//    String getName();
//
//    void setName(String name);
//}