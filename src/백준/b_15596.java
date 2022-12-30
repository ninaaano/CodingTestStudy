package 백준;// @ author ninaaano

public class b_15596 {
    static class Test{
        long sum(int[] a) {
            //a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
            //리턴값: a에 포함되어 있는 정수 n개의 합 (정수)
            int sum = 0;

            for(int i=0; i<a.length; i++){
                sum += a[i];
            }

            return sum;
        }

        public static void main(String[] args) {
            Test test = new Test();
            test.sum(new int[10]);
            System.out.println(test);
        }
    }
}
