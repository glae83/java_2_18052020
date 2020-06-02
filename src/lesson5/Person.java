package lesson5;

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void printPerson(){
       System.out.printf("ФИО: %s  Должность: %s  email: %s  Телефон: %s  Зарплата: %d  Возраст: %d ", fullName, position, email, phone, salary, age);
       System.out.println();
    }

}