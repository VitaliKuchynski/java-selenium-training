package classwork.bankAccountExample;

/**
 * Created by vitalikuchynski on 12/16/17.
 */

public class Account {
    //Initialises variable balance
    double balance;
    //Initialises variable accountId
    String accountId;
    static  int nextId = 0;
    //Creates final int variable
    static final int ROUTING_NUMBER = 1234;

    //Adds amount to the balance
    public void  deposit(double amount){
        balance = balance + amount;
    }

    //Subtracts amount from balance
    public void withdrow(double amount){
        balance = balance - amount;


    }
}

