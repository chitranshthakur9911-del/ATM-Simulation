package ATMMachine;

public class UserInfo {
    String name;
    int AccountNo;

    UserInfo(String name, int AccountNo) {
        this.name = name;
        this.AccountNo = AccountNo;
    }

    public void Display() {
        System.out.println("--------- Account Holder Details---------");
        System.out.println(" Account Holder Name --" + name);
        System.out.println(" Account Number --" + AccountNo);
        System.out.println("------------------------------------------");
    }
}

