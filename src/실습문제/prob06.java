package 실습문제;

public class prob06 {
    public static void main(String[] args) {
        int[] array = {3, 24, 1, 55, 17, 43, 5};
        System.out.println("[배열의 내용]");
        for(int i = 0; i<array.length;i++){
            if(i==array.length-1){
                System.out.println(array[i]);
            }else{
                System.out.print(array[i]+", ");
            }
        }

        for(int i=0;i<array.length;i++) { // 방은 7개 배열은 0 1 2 3 4 5 6
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("[클래스 실행결과]");
                for(int i = 0; i<array.length;i++){
                  if(i==array.length-1){
                      System.out.print(array[i]);
                  }else{
                      System.out.print(array[i]+", ");
                  }
                }
    }
}
