package 코드스쿼드;// @ author ninaaano

public class Drink {
    private int cost;
    private String coffeeName;

    public Drink(String coffeeName, int cost) {
        this.coffeeName = coffeeName;
        this.cost = cost;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCost() {
        return cost;
    }
}
