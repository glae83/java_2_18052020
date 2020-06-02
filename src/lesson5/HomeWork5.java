package lesson5;
import java.util.Scanner;
public class HomeWork5 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Вывести информацию о сотрудниках старше :");
        int x = sc.nextInt();
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "000000000",30000,30);
        persArray[1] = new Person("Kuznecov Andrey", "Driver", "kuznecov@mailbox.com", "8888888",20000,48);
        persArray[2] = new Person("Kutuzov Vasiliy", "Cook", "kutuzov@mailbox.com", "777777",10000,50);
        persArray[3] = new Person("Maksomov Mixail", "Installer", "maksimov@mailbox.com", "11111111",12000,38);
        persArray[4] = new Person("Kotov Sergey", "Programmer", "kotov@mailbox.com", "9999999",15000,25);
        for (int i = 0; i < persArray.length; i++){
            if(persArray[i].getAge() > x) {
                persArray[i].printPerson();
            }
        }
    }
}