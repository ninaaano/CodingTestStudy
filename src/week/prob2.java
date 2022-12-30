package week;// @ author ninaaano

import java.util.Stack;

public class prob2 {
    public static String solution(String cryptogram) {
        //       StringBuilder sb = new StringBuilder();
        //String answer = "";
        // 배열에 글자를 각각 넣어서 for문을 돌려
        // 앞 글자랑 뒷 글자랑 같으면 지워줘
        // 다시 배열을 돌아서 앞 글자랑 뒷 글자랑 같으면 지워
        // while문을 써보자
        Stack<Character> stack = new Stack<>();

        for (char c : cryptogram.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }

        StringBuilder answer = new StringBuilder();

        for (char c : stack) {
            answer.append(c);
        }

        return answer.toString();
    }





//        char[] chArr = cryptogram.toCharArray();
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < chArr.length; i++) {
//            char c = chArr[i];
//            if (stack.isEmpty())
//                stack.push(c);
//            if (stack.peek() == c) {
//                stack.pop();
//            }else
//                answer += stack.push(c);
//
//        }
//        return stack.isEmpty() ? answer : "";
//    }


//        for (int i = 0; i < cryptogram.length(); i++) {
//          //  answer = answer.replaceAll("[a-z]{2,}", "");
//            String target = String.valueOf(cryptogram.charAt(i));
//            int index = cryptogram.indexOf(target);
//            for (int j = i + 1; j < cryptogram.length(); j++) {
//                if (j == index) {
//                    continue;
//                }
//                if (!answer.contains(target)) {
//                    answer += target;
//                }
//            }
//
//        }
//        return answer;
//    }





//        for(int i=0; i<cryptogram.length(); i++){
//        String sep = String.valueOf(cryptogram.charAt(i));
//        if(!answer.contains(sep)){
//            answer += sep;
//        }
//    }
//        for(char c:cryptogram.toCharArray()){
//            if(!answer.contains(String.valueOf(c))){
//                answer += String.valueOf(c);
//            }
//        }

    public static void main(String[] args) {
        prob2 prob = new prob2();
        String str = "zyellleyz";
        System.out.println(solution(str));
    }
}

