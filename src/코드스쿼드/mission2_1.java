package 코드스쿼드;// @ author ninaaano

public class mission2_1 {
    public static void main(String[] args) {
        System.out.println(Sum(10,2));
        System.out.println(Minus(10,2));
        System.out.println(Division(10,2));
        System.out.println(Multi(10,2));
    }

    public static int Sum(int a,int b) {
        int sum = 0;
        sum = a+b;
        return sum;
    }

    public static int Minus(int a,int b){
        int minus = 0;
        minus = a-b;
        return minus;
    }

    public static int Division(int a,int b){
        int division = 0;
        division = a/b;
        return division;
    }

    public static int Multi(int a,int b){
        int multi = 0;
        multi = a*b;
        return multi;
    }

}
