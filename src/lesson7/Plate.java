package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        int foodCheck = food - amount;
        if (foodCheck < 0) return false;
        food -= amount;
        return true;
    }

    public void addFood(int food) {
        System.out.println("Добавляем в тарелку " + food );
        this.food += food;
    }

    public void info() {
        System.out.println("В тарелке осталось: " + food);
    }
}
