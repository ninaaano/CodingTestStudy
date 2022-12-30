package 코드스쿼드;// @ author ninaaano

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String cafeName;
    private List<Drink> menu;

    public Cafe(String cafeName){
        this.cafeName = cafeName;
    }

    public void addMenu(Cafe cafe, Drink drink) {
        List<Drink> menu = new ArrayList<>();
        menu.add(drink);
        cafe.setMenu(menu);
    }

    public String getCafeName() {
        return cafeName;
    }

    private void setMenu(List<Drink> menu) {
        this.menu = menu;
    }
}
