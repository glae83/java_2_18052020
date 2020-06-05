package lesson6;

public class Dog extends HomeWork6.Animal {
    public Dog(String name) {
        super(name);
        this.maxLenght = random.nextInt(99) + 400;;
        this.maxSwim = random.nextInt(5) + 4;;
    }
}