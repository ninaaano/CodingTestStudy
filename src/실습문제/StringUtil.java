package 실습문제;

public class StringUtil {

    private static String replaceString(String[] arr) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j <arr[i].length(); j++){
                if(arr[i].charAt(j)=='a'){




                  //  result = arr.replace('a','A');

                }
            }



        }
        return null;
    }

        public static void main(String[] args){
            String[] arr = {"java program", "array", "java program area", "append"};
            String result = StringUtil.replaceString(arr);
            System.out.println("변경된 문자열 : " + result);

        }
    }

