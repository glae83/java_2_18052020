package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static final int SIZE = 8;
    static final int DOTS_TO_WIN = 4;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map ;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMaps();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Вы проиграли! Победил компьютер");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMaps() {
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите значения X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }
    //Поиск победной комбинации
    public static void aiTurn() {
        //компьютера
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        //игрока
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        //Если ничего нет, то рандомим
        int x,y;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE  || y >= SIZE  ) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    // ищем выигрышные комбинации
    private static boolean сheckWinLine(int y, int x, int lineY, int lineX, char c) {
        int checkY = y + (DOTS_TO_WIN - 1) * lineY;
        int checkX = x + (DOTS_TO_WIN - 1) * lineX;
        if (checkY < 0 || checkX < 0 || checkY > SIZE || checkX > SIZE ) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int tempY = y + i * lineY;
            int tempX = x + i * lineX;
            if (map[tempY][tempX] != c) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (сheckWinLine(i, j, 1, 0,  c)) {
                    return true;
                }
                if (сheckWinLine(i, j, 0, 1,  c)) {
                    return true;
                }
                if (сheckWinLine(i, j, 1, 1,  c)) {
                    return true;
                }
                if (сheckWinLine(i, j, -1, 1, c)) {
                    return true;
                }
            }
        }
        return false;
    }
}

