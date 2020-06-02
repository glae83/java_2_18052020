package lesson6;
import java.util.Random;
import java.util.Scanner;

public class HomeWork6

{
    public static void main(String[] args) {
        Cat cat = new Cat("Васька");
        Dog dog = new Dog("Тузик");
        Scanner sc = new Scanner(System.in);
        int lengthDog, lengthCat, swinDog, swimCat;
        System.out.println("Введите длинну бега собаки и кошки");
        lengthDog = sc.nextInt();
        lengthCat = sc.nextInt();
        System.out.println("Введите длинну плавания собаки и кошки ");
        swinDog = sc.nextInt();
        swimCat = sc.nextInt();
        dog.run(lengthDog);
        dog.swim(swinDog);
        System.out.println();
        cat.run(lengthCat);
        cat.swim(swimCat);
    }

    public static class Animal {
        String name;
        int maxLenght;
        int maxSwim;
        public Random random = new Random();

        public Animal (String name){
            this.name = name;
        }

        public void run(int length) {
            if (this.maxLenght >= length){
                System.out.println(this.name + " пробежал " + length + " м." + this.maxLenght);
            }
            else {
                System.out.println(this.name + " не может бежать так далеко" + this.maxLenght);
            }
        }

        public void swim(int length) {
            if (this.maxSwim >= length) {
                System.out.println(this.name + " проплыл " + length + " м." +this.maxSwim);
            }
            else {
                System.out.println(this.name + " не может плыть так далеко" +this.maxSwim);
            }
        }
    }
}