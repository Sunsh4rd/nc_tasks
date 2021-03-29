package alkr;

import encapsulation.EncapsulationClass;
import inheritance.Inheritance;
import polymorphism.Polymorphism;

public class Main {

    public static void main(String[] args) {

        InheritanceImplementor inheritanceImplementor = new InheritanceImplementor();
        inheritanceImplementor.inheritedMethod();
        System.out.println("-------------------------------");
        PolymorphismImplementor polymorphismImplementor = new PolymorphismImplementor();
        PolymorphismImplementor anotherPolymorphismImplementor = new AnotherPolymorphismImplementor();
        polymorphismImplementor.polymorphicMethod();
        anotherPolymorphismImplementor.polymorphicMethod();
        System.out.println("-------------------------------");
        EncapsulationClass encapsulationClass = new EncapsulationClass();
        encapsulationClass.setEncapsulatedField(1000);
        System.out.println(encapsulationClass.getEncapsulationField());
    }
}

class InheritanceImplementor implements Inheritance {

    @Override
    public void inheritedMethod() {
        System.out.println("This is an inherited method");
    }
}

class PolymorphismImplementor implements Polymorphism {

    @Override
    public void polymorphicMethod() {
        System.out.println("This is a polymorphic method");
    }
}

class AnotherPolymorphismImplementor extends PolymorphismImplementor {

    @Override
    public void polymorphicMethod() {
        System.out.println("And another polymorphic method");
    }
}
