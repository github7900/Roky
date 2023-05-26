abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("I am eating");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.eat();

        animal = new Cat();
        animal.makeSound();
        animal.eat();
    }
}