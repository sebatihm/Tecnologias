package MalCodigo;

public class Account {
    private double balance; 
    private String name;
    private String accountType;


    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public double CalculatedInterest(){
        switch (accountType) {
            case "current":
                return balance * 0.2;
            case "saving":
                return balance * 0.3;
            case "otra":
                return balance * 0.4;
        
            default:
                return balance;
        }
    }
    
    
}