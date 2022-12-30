package 코드스쿼드;// @ author ninaaano
/*
- 윤년 계산. 2월
 1,3,5,7,8,10,12 > 31
 2,4,6,9,11 > 31일이 아님
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if(year%100==0?year%400==0:year%4==0){
            day = 29;
        }else
            day = 28;

        return false;
    }

}

