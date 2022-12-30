package 실습문제;

public class Sortutil {
    public int[] ascending(int[] inputNumbers){
        for(int i=0;i<inputNumbers.length;i++) { // 방은 7개 배열은 0 1 2 3 4 5 6
            for (int j = i+1; j < inputNumbers.length; j++) {
                if (inputNumbers[i] > inputNumbers[j]) {
                    int temp = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = temp;
                }
            }
        }
        return inputNumbers;
    }

    public static void main(String[] args) {

        Sortutil util = new Sortutil();
        int[] numbers = new int[] {7,5,2,19,34,51,32,11,67,21};

        numbers = util.ascending(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);

            if(i != numbers.length-1){
                System.out.print(",");
            }else{
                System.out.println(" ");
            }
        }
        System.out.println("Successfull!");
    }
}
/*
 */