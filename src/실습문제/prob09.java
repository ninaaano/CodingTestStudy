package 실습문제;

public class prob09 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = 0;

        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
