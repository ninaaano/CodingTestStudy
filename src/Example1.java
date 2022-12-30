class Example1
{
    public static void main(String[] args)
    {
        System.out.println("숫자를 입력하세요 : ");
        int a = Integer.parseInt(args[0]);

        if (a >= 0 && a <= 100 )   {
            if(a >= 90) {
                System.out.println("수");
            }else if(a >= 80) {
                System.out.println("우");
            }else if(a >= 70){
                System.out.println("미");
            }else if(a >= 60) {
                System.out.println("양");
            }else{
                System.out.println("가");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}