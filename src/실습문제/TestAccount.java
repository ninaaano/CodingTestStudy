package 실습문제;

public class TestAccount {

    private int balance;
    private String accNo;

    public TestAccount(){
    }
    public TestAccount(String accNo){
        this.accNo = accNo;
        System.out.println(accNo + "계좌가 개설되었습니다.");
    }
    public void save(int money){
        balance += money;
        System.out.println(accNo + "계좌에 "+money+"원이 입금되었습니다.");
    }
    public void deposit(int money){
        balance -= money;
        System.out.println(accNo+"계좌에 "+money+"원이 출금되었습니다.");
    }
    public String getAccNo(){
        return accNo;
    }
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args){

        String accNo = null;
        int balance = 0;

        TestAccount accObj = new TestAccount("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + "계좌의 잔고는"+balance+" 만원입니다.");

        accObj.save(100);
        balance=accObj.getBalance();
        System.out.println(accObj.getAccNo()+"계좌의 잔고는"+balance+" 만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo+"계좌의 잔고는"+balance+" 만원입니다.");

    }
}
