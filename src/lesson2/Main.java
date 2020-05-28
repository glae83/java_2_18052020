package lesson2;
import java.util.Arrays;
import java.util.Random;
public class Main {
    static Random random;
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] printarr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] printarr = new int[8];
        int[] printarr4 = new int[8];
        int[] printarr5 = {1, 3, 2, 2, 1, 2, 9, 2};
        int[][] printarr3 = new int[7][7];
        int[] printarr6 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 5;
        printWord(arr);
        printArray(printarr);
        printArray2(printarr2);
        printArray3(printarr3);
        printArray4(printarr4);
        System.out.println(printArray5(printarr5));
        printArray6(printarr6, n);
    }
    //Задача1
    public static void printWord(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    // Задача2
    public static void printArray(int[] printarr){
        for (int i = 0; i < printarr.length; i++) {
            if (i == 0) {
                printarr[i]=0;
            } else {
                printarr[i]=printarr[i-1]+3;
            }
            System.out.print(printarr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    //Задача3
    public static void printArray2(int[] printarr2){
        for (int i = 0; i < printarr2.length; i++) {
            if (printarr2[i] < 6)
            {
                printarr2[i]*=2;
            }
            System.out.print(printarr2[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    //Задача4
    public static void printArray3(int[][] printarr3) {
        for (int i = 0; i < printarr3.length; i++) {
            for (int j = 0; j < printarr3[i].length; j++) {
                if (i == j || i+j == printarr3.length-1) {
                    printarr3[i][j] = 1;
                }
                System.out.print(printarr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Задача5
    public static void printArray4(int[] printarr4) {
        random = new Random();
        for (int i = 0; i < printarr4.length; i++) {
            printarr4[i] = random.nextInt(10);
        }
        int max = printarr4[0];
        int min = printarr4[0];
        for (int i = 1; i < printarr4.length; i++) {
            if (max < printarr4[i]) {
                max = printarr4[i];
            } else if (min > printarr4[i]) {
                min = printarr4[i];
            }
        }
        System.out.println(Arrays.toString(printarr4));
        System.out.println("Максимальное значение: " +max);
        System.out.println("Минимальное значение: " +min);
        System.out.println();
    }
    //Задача6
    public static boolean printArray5(int[] printarr5) {
        int k = printarr5[0];
        int summ = 0;
        for (int i = 0; i <printarr5.length ; i++) {
            summ = summ + printarr5[i];
        }
        for (int i = 1; i < printarr5.length; i++) {
            if (summ - k == k)  return true;
            else {
                k = k + printarr5[i];
            }
        }
        return false;
    }
    //Задача7
    public static void printArray6(int[] printarr6, int n) {
        int temp;
        int text = n;
        if (n > 0) {
            for (int i = 0; i < n ; i++) {
                for (int j = printarr6.length; j > 1; j--) {
                    temp = printarr6[j-1];
                    printarr6[j-1] = printarr6[j-2];
                    printarr6[j-2] = temp;
                }
            }
        }
        else {
            n=-n;
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < printarr6.length-1; j++) {
                    temp = printarr6[j+1];
                    printarr6[j+1] = printarr6[j];
                    printarr6[j] = temp;
                }
            }
        }
        System.out.println("\n" +"Массив после смещения на " +text +" позиций:" +"\n" +Arrays.toString(printarr6));
    }
}




