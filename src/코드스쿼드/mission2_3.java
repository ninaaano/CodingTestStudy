package 코드스쿼드;// @ author ninaaano

/*
사람은 이름과 돈을 가지고 있다
카페는 카페이름과 음료를 가지고 았다
음료는 음료 이름과 음료 가격을 가지고 있다
- 음료의 이름과 음료의 가격을 하나로 묶는다 > 카페로 전달
주문은 사람과 카페를 가지고 있다
- 사람이 음료를 가진 카패에서 음료를 구매한다.
- 거래가 이루어진다.

get - return;
set - this.
 */

public class mission2_3 {
    public static void main(String[] args) {
        Person james = new Person("james", 5000);
        Person tomas = new Person("tomas", 10000);

        Cafe starCoffee = new Cafe("별 다방");
        Drink americano = new Drink("아메리카노", 4000);

        Cafe beanCoffee = new Cafe("콩 다방");
        Drink latte = new Drink("라떼", 5000);

        Order order = new Order();

        /*
        James님의 남은 돈은 1000원 입니다. 별 다방에서 아메리카노를 마셨습니다.
        Tomas님의 남은 돈은 5000원 입니다. 콩 다방에서 라떼를 마셨습니다.
         */
        System.out.println(james.getName() + "님의 남은 돈은 " + order.getSellTo(james, americano) + "입니다." +
                starCoffee.getCafeName()+ "에서 " + americano.getCoffeeName() + "를 마셨습니다");
        System.out.println(tomas.getName() + "님의 남은 돈은 " + order.getSellTo(tomas, latte) + "입니다." +
                beanCoffee.getCafeName()+ "에서 " + latte.getCoffeeName() + "를 마셨습니다");

    }
}







