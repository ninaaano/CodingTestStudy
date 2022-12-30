package 실습문제;

public class prob10 {
    public void printSeason(int month) {
        if (month < 0 || month > 13) {
            System.out.println("1~12사이의 숫자만 입력하셔야 합니다.");
            return;
        }
        String season = "겨울";
        switch (month) {
            case 12:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
        }
        System.out.println(season + "에 태어나셨네요.");
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        new prob10().printSeason(month);
    }
}

