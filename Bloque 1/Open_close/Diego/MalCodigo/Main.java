package MalCodigo;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100, "Diego", "current");
        System.out.println(account.CalculatedInterest());
    }
}
