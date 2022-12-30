package 실습문제;

public class Prob13 {
    public static void main(String[] args) {
        int limit = 67;
        Util util = new Util();

        int primeCount = util.findPrimeCount(limit);
        System.out.println("1~" + limit + "까지의 소수의 개수는 : "+primeCount + "EA 이며 소수는 아래와 같다.");

        System.out.println("/////////////////////////////");

        int[] arr = util.findPrimeReturnArray(limit);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((arr.length - 1) != i ? "," : ""));
        }
    }

}
