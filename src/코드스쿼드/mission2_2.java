package 코드스쿼드;// @ author ninaaano

public class mission2_2 {
    public static void main(String[] args) {

        User user = new User();
        user.name = "제인";
        user.age = 30;
        user.sex = "여성";
        user.married = "기혼자";
        user.kid = 1;

        System.out.println(user.UserInfo());
    }
    public static class User {
        String name; // 제인
        int age; // 30세
        String sex; // 여성
        String married; // 기혼
        int kid; // 1명

        public User(){};

        public User(String name, int age, String sex, String married, int kid) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.married = married;
            this.kid = kid;
        }

        public String UserInfo(){ // 이름은 제인이고 나이는 30살 입니다.  성별은 여성이며, 기혼자 입니다. 자녀는 1명이 있습니다
            return "이름은 " + name + "이고 나이는 " + age + "살 입니다. 성별은 " + sex + "이며, " + married + " 입니다. 자녀는 " + kid + "명이 있습니다";
        }

    }
}
