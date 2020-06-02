package lesson6;

public class Cat extends HomeWork6.Animal {
    public Cat(String name) {
        super(name);
        this.maxLenght = random.nextInt(99) + 100;
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Кот не умеет плавать!");
    }
}