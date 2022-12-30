class Test3
{
    public static void main(String[] args)
    {
        System.out.println("숫자를 입력하세요 : ");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a%2 == 0){
            System.out.print("입력하신 숫자 "+a+"은/는 짝수,");
        }else{
            System.out.print("입력하신 숫자 "+a+"은/는 홀수,");
        }if(a%3 == 0){
        System.out.println("3의 배수입니다.");
    }else{
        System.out.println("3의 배수가 아닙니다");
    }
        if(b%2 == 1){
            System.out.print("입력하신 숫자 "+b+"은/는 홀수,");
        }else{
            System.out.print("입력하신 숫자 "+b+"은/는 짝수,");
        }if(b%3 == 0){
        System.out.println("3의 배수입니다.");
    }else{
        System.out.println("3의 배수가 아닙니다");
    }
    }
}