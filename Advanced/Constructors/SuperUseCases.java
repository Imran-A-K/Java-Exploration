package Advanced.Constructors;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    public void displaySound() {
        super.makeSound(); // Calls the makeSound method from Animal class
        makeSound();       // Calls the overridden makeSound method from Dog class
    }
}

public class SuperUseCases {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displaySound();
    }
}

