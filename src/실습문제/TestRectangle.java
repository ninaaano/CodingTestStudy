package 실습문제;

import java.util.*;

public class TestRectangle {

    private int width; // 가로
    private int length; // 세로
    private int area;
    private int perimeter;
    private String color;

    public void setWidth(int newWidth){
        width = newWidth;
    } public int getWidth(){
        return width;
    } public void setLength(int newLength){
        this.length = newLength;
    } public int getLength(){
        return length;
    } public int area() {
        return length*width;
    } public int perimeter(){
        return 2*(length+width);
    } public void setColor(String newColor){
        this.color = newColor;
    } public String getColor (){
        return color;
    }

    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);

        TestRectangle rec1 = new TestRectangle();
        System.out.println("첫번째 직사각형의 색깔: ");
        rec1.setColor(keyborad.next());

        System.out.println("첫번째 직사각형의 가로: ");
        rec1.setWidth(keyborad.nextInt());

        System.out.println("첫번째 직사각형의 세로: ");
        rec1.setLength(keyborad.nextInt());

        TestRectangle rec2 = new TestRectangle();
        System.out.println("두번째 직사각형의 색깔: ");
        rec2.setColor(keyborad.next());

        System.out.println("두번째 직사각형의 가로: ");
        rec2.setWidth(keyborad.nextInt());

        System.out.println("두번째 직사각형의 세로: ");
        rec2.setLength(keyborad.nextInt());

        System.out.println(rec1.getColor() + "직사각형의 넓이는 "+rec1.area()+ "이고 둘레는 "+rec1.perimeter() + "입니다.");
        System.out.println(rec2.getColor() + "직사각형의 넓이는 "+rec2.area()+ "이고 둘레는 "+rec2.perimeter() + "입니다.");

        // 두 직사각형의 넓이 비교
        if(rec1.area() > rec2.area()) {
            System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
        }else if(rec1.area()<rec2.area()){
            System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
        }else {
            System.out.println("넓이는 같습니다.");
        }

        // 두 직사각형의 둘레를 비교
        if(rec1.perimeter() > rec2.perimeter()){
            System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
        }else if(rec1.perimeter() < rec2.perimeter()){
            System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
        }else{
            System.out.println("둘레는 같습니다.");
        }

    }
}
