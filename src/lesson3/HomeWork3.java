package lesson3;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner sc;
    static Random random;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        int y = random.nextInt(10);
        int a;
        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("Угадайте случайное число от 0 до 9!");
                int x = sc.nextInt();
                if (x == y) {
                    System.out.println("Вы угадали!");
                    break;
                } else if ( x > y) {
                    System.out.println("Вы не угадали. Случайное число меньше введеного вами числа");
                } else { System.out.println("Вы не угадали пароль. Случайное число больше введеного вами числа");
                }
            }
            System.out.println("Продолжаем? 1 - Да, 0 - Нет");
            a = sc.nextInt();
            y = random.nextInt(10);
        } while (a == 1);
    }
}


