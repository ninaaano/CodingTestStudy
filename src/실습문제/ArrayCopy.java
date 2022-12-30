package 실습문제;
// 배열의 값들을 순서를 뒤집어 Vector에 담는 함수 작성
//"5","4","3","2","1"이 되게 출력

import java.util.Vector;

public class ArrayCopy {
    public Vector<String> moveToVector(String[] datas){

        Vector moveToVector = new Vector<>(datas.length,1);
        Vector v = moveToVector;

        for(int i = datas.length-1; i > -1; i--){
            v.add(datas[i]);

        } return v;
    }

    public static void main(String[] args) {
        ArrayCopy ac = new ArrayCopy();
        String datas[] = {"1","2","3","4","5"};
        System.out.println(ac.moveToVector(datas));
    }
}
