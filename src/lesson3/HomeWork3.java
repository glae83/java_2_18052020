package lesson3;
        import java.util.Random;
        import java.util.Scanner;
public class HomeWork3 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Выберите номер игры или Выйти:\n"+
                    "1. Отгадать цифру\n2. Отгдать слово\n3. Выход из игры\n: ");
            switch (sc.next()) {
                case "1":
                    gameNumeral();
                    break;
                case "2":
                    guessWord();
                    break;
                default:
                    return;
            }
        }
    }
    //Задание 1
    static void gameNumeral() {
        int y = random.nextInt(10);
        int a;
        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("Угадайте случайное число от 0 до 9!");
                System.out.println("* Загадано: " +y +" *");
                int x = sc.nextInt();
                if (x == y) {
                    System.out.println("Вы угадали!");
                    break;
                } else if ( x > y) {
                    System.out.println("Вы не угадали. Случайное число меньше введеного вами числа");
                } else { System.out.println("Вы не угадали. Случайное число больше введеного вами числа");
                }
            }
            System.out.println("Продолжаем? 1 - Да, 0 - Нет");
            a = sc.nextInt();
            y = random.nextInt(10);
        } while (a == 1);
    }
    //Задание 2
    private static void guessWord() {
        String[] fruits = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int words = random.nextInt(fruits.length - 1);
        String word = fruits[words];
        char[] text = word.toCharArray();
        char[] text2 = new char[17];
        System.out.println("Я загадал слово, попробуй отгадать его");
        System.out.println("* Загадано: " +word +" *");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи ваш ответ или введите Enter для выхода");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals("")) break;
            else if (word.equals(userAnswer)) {
                System.out.println("Вы угадали!");
                break;
            }
            for (int i = 0; i < 17; i++) {
                if (i > 1) {
                    text2 [i] = '#';
                } else
                {
                    text2 [i] = text[i];
                }
            }
            System.out.println(text2);
        }
        while (true);
    }
}