package 실습문제;

public class prob15 {
    public void calc(int[] ix){

        int sum01 = 0; // 홀수
        int sum02 = 0; // 짝수
        for(int i = 0; i<ix.length; i++) {
            if (ix[i] % 2 == 1) {
                sum01 += ix[i];
            }
            if (ix[i] % 2 == 0) {
                sum02 += ix[i];
            }
        }
            System.out.println("홀수의 합 : "+sum01);
            System.out.println("짝수의 합 : "+sum02);
        }

    public static void main(String[] args) {
        int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
        int[] ib = new int[]{1, 2, 3, 4, 5};

        prob15 p = new prob15();
        System.out.println("(배열 ia)");
        p.calc(ia);
        System.out.println("(배열 ib)");
        p.calc(ib);
    }
}
