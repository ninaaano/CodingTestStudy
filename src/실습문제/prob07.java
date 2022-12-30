package 실습문제;
/*
 4의 배수인 해는 윤년
 4의 배수이면서 100의 배수인 해는 윤년이 아님 = 28일
 100의 배수이면서 400의 배수인해는 윤년 = 29일
 year%4==0 && year%100!=0
 year%100==0 && year%400==0
 ==> year%4==0 && (year % 100 != 0 || year % 400 == 0)
 && > 앞 뒤 모두 트루
 != 같지않다
 || 앞 뒤 둘중하나가 트루일때 트루
 1,3,5,7,8,10,12 > 31
 2,4,6,9,11 > 30일이 아님
 */
public class prob07 {
    public static void main(String[] args) {
        int year = 2010;
        int month = 2;
        int maxDay = 0;

        if(year%100==0?year%400==0:year%4==0){
            maxDay = 29;
        }else
            maxDay = 28;

        System.out.println(year+"년 "+month+"월의 말일은 "+maxDay+"일 입니다.");
    }
}
