package 코드스쿼드;// @ author ninaaano

public class Order {
    // 카페와 사람을 알고 있어야한다?
    private Cafe cafe;
    private Drink drink;
    private Person person;
    private int payment; // 계산을 위한..?

    public int getSellTo(Person person, Drink drink) {
        payment = person.getMoney() - drink.getCost();
        return payment;
    }

    public void setAccount(int payment){
        this.payment = payment;
    }

}
