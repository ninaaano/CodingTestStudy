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
        System.out.println("�Է� : Korea");
        System.out.println("��� : "+p1.toEncoding("Korea"));
        System.out.println("�Է� : ȫ�浿");
        System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
//		System.out.println("�Է� : ȫ �� ��");
//		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
//		System.out.println("�Է� : Hong �� ��");
//		System.out.println("��� : "+p1.toEncoding("Hong �� ��"));
//		System.out.println("�Է� : 0319");
//		System.out.println("��� : "+p1.toEncoding("0319"));
//
    }

}
