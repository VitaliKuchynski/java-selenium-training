package classwork.bankAccountExample;

/**
 * Created by vitalikuchynski on 12/16/17.
 */

public class Customer {
    //Initialises variable firstName
    String firstName;
    //Initialises variable secondName
    String secondName;
    //Initialises variable acc with type Account
    Account acc;



    public void addAccount(double initialBalance){

        //Instance of Account
        acc = new Account();
        //gets account ID and increments it
        acc.accountId = "ACCT ID = " + Account.nextId++;
        //Assignees initialBalance to the balance variable
        acc.balance = initialBalance;
        System.out.println(acc.accountId + " added");
        System.out.println("Account added for " + firstName + " " + secondName);

    }
}
