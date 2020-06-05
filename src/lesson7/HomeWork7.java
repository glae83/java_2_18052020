package lesson7;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cat1, cat2, cat3;
        System.out.println("У вас 3 кошки, введите сколько они едят");
        cat1 = sc.nextInt();
        cat2 = sc.nextInt();
        cat3 = sc.nextInt();
        Cat[] arrCats = new Cat[3];
        arrCats[0] = new Cat("Барсик", cat1);
        arrCats[1] = new Cat("Тимка", cat2);
        arrCats[2] = new Cat("Снежок", cat3);

        Plate plate = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }
        plate.addFood(100);
        plate.info();
    }
}