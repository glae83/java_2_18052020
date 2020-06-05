package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = true;
    }

    void info() {
        System.out.println(name + " кушает " + appetite + "\n" + name + " начитает кушать");
        String hungry = !fullness ? " сытый" : " остался голодным";
        System.out.println(name + hungry);
    }

    public void eat(Plate plate) {
        if (fullness == true && plate.decreaseFood(appetite) == true) {
            fullness = false;
        }
        System.out.println();
    }
}
