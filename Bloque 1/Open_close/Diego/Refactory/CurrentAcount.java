package Refactory;

public class CurrentAcount extends Account {
    
    public CurrentAcount(double balance, String name, String accountType){
        super(balance,name,accountType);
    }

    @Override
    public double getBalance(){
        return this.balance *0.2;
    }
}
