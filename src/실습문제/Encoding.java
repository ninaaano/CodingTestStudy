public class Encoding {

    public String toEncoding(String str) {
        // TODO Auto-generated constructor stub

        String value = "Korea";
        byte[] temp = value.getBytes();
        System.out.println(Integer.toHexString(temp[0]));
        return value;

//		value = "A";
//		temp = value.getBytes();
//		System.out.println(Integer.toHexString(temp[0]));
//


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Encoding p1 = new Encoding();
        System.out.println("입력 : Korea");
        System.out.println("출력 : "+p1.toEncoding("Korea"));
        System.out.println("입력 : 홍길동");
        System.out.println("출력 : "+p1.toEncoding("홍길동"));
//		System.out.println("입력 : 홍 길 동");
//		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
//		System.out.println("입력 : Hong 길 동");
//		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
//		System.out.println("입력 : 0319");
//		System.out.println("출력 : "+p1.toEncoding("0319"));
//
    }

}
