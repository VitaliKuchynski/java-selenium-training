package homeworks.bankAccountExample;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * Created by vitalikuchynski on 12/22/17.

 * Account class contains variables and methods() to manage bank account
 **/

public class Account {
    //Initialises final int variable
    static final int ROUTING_NUMBER = 1234;
    //Declares variable for class data
    private static int nextId = 0;
    //Declares String customer name variable
    private static String customerName;
    //Declares variable balance
    private double balance;
    //Declares variable accountId
    private String accountId;
    //Declares variable date
    private String date;

    //Creates instance of ArrayList
    ArrayList tr = new ArrayList();
    //Declares transactionActivities variable
    TransactionActivities transactionActivities;
    //Creates of file and creates file first time
    File fileName = new File("TransactionHistory.txt");
    //Initialises variable with fileWriter type
    FileWriter fw = null;
    //Initialises variable with Writer type
    Writer output = null;

    //Gets next id and increment it
    public static String getNextId() {
        return "# " + nextId++;
    }

    //Sets next ID
    public static void setNextId(int nextId) {
        Account.nextId = nextId;
    }

    //Gets formatted current date
    public String getDate() {
        //Instance of calendar
        Calendar calendar = Calendar.getInstance();
        //Creates formatter and sets the format of date
        SimpleDateFormat formatCurrentDate = new SimpleDateFormat("MM/dd/yyyy "+" hh:mm:ss");
        //Gets current date from the system, converts it to the string format and assignees to date variable
        date = formatCurrentDate.format(calendar.getTime());
        return date;
    }

    //Returns customer
    public String getCustomerName() {
        return customerName;
    }

    //Sets customer name after instance customer created
    public void setCustomerName(String customerName) {
        Account.customerName = customerName;

    }

    //Gets balance value
    public double getBalance() {
        return balance;
    }

    //Sets balance value
    public void setBalance(double balance) {
        this.balance = balance;

    }

    //Gets account ID
    public String getAccountId() {
        return accountId;
    }

    //Sets account ID
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    //Adds amount to the balance
    public void deposit(double amount)  {
        balance = balance + amount;
        System.out.println("------------------");
        System.out.println("Deposit added the new balance: " + getBalance());
        //Creates instance of transaction activities and passes  customerName, Date, TransactionTypes, transaction amount and balance
        transactionActivities = new TransactionActivities(customerName, getDate(),TransactionTypes.DEPOSIT,amount, this.balance);
        //Adds transaction activities object to Array
        tr.add(transactionActivities);

        //Writes array data to the file
        try{
            //Instance of FileWriter gets file to write and can be added
            fw = new FileWriter(fileName, true);
            //Instance of BufferedWriter gets file
            output = new BufferedWriter(fw);
            //Writes to a file
            output.write(String.valueOf(tr));
            //output.flush();
            //Close writer
            output.close();
        }
        //Catch any problems
        catch (IOException e){
            JOptionPane.showInternalMessageDialog(null,"Error:");
        }

    }

    //Subtracts amount from balance
    public void withdraw(double amount) {
        //Checks if entered amount greater then balance
        if ((amount > balance) | (amount == 0)) {
            System.out.println("Decline you try withdraw: " + amount + " You current balance: " + balance);

        } else {
            balance = balance - amount;
            System.out.println("------------------");
            System.out.println("Withdraw completed, remain balance: " + balance);
        }
        //Creates instance of transaction activities and passes  customerName, Date, TransactionTypes, transaction amount and balance
        transactionActivities = new TransactionActivities(customerName, getDate(),TransactionTypes.WITHDRAW,amount, this.balance);
        //Adds transaction activities object to Array
        tr.add(transactionActivities);

        //Writes array data to the file
        try{
            //Instance of FileWriter gets file to write and can be added
            fw = new FileWriter(fileName, true);
            //Instance of BufferedWriter gets file
            output = new BufferedWriter(fw);
            //Writes to a file
            output.write(String.valueOf(tr));
            //output.flush();
            //Close writer
            output.close();
        }
        //Catch any problems
        catch (IOException e){
            JOptionPane.showInternalMessageDialog(null,"Error:");
        }
    }

    //Transfers amount from customer account
    public void transferSend(double amount, int ROUTING_NUMBER, String bankName) throws IOException {

        //Checks if user enters correct amount routing number and bank account
        if (amount == 0) {
            System.out.println("Please enter correct amount.");
        } else if (amount > balance) {
            System.out.println("Decline you try to transfer: " + amount + " You current balance: " + balance);
        } else if (!(ROUTING_NUMBER == this.ROUTING_NUMBER) | !(bankName.equalsIgnoreCase("CHASE"))) {
            System.out.println("Please check you ROUTING_NUMBER and BANK NAME and try again.");
        } else {
            balance = balance - amount;
            System.out.println("------------------");
            System.out.println(amount + " transferred from " + customerName + " account, remain balance: " + this.balance);
        }
        //Creates instance of transaction activities and passes  customerName, Date, TransactionTypes, transaction amount and balance
        transactionActivities = new TransactionActivities(customerName, getDate(),TransactionTypes.TRANSFER,amount, this.balance);
        //Adds transaction activities object to Array
        tr.add(transactionActivities);

        //Writes array data to the file
        try{
            //Instance of FileWriter gets file to write and can be added
            fw = new FileWriter(fileName, true);
            //Instance of BufferedWriter gets file
            output = new BufferedWriter(fw);
            //Writes to a file
            output.write(String.valueOf(tr));
            //output.flush();
            //Close writer
            output.close();
        }
        //Catch any problems
        catch (IOException e){
            JOptionPane.showInternalMessageDialog(null,"Error:");
        }
    }

    //Prints account information
    public void displayAccountDetails() {
        System.out.println("*** Account Information ***");
        System.out.println("Customer name: " + customerName);
        System.out.println(accountId);
        System.out.println("Balance: " + this.balance);
        System.out.println("------------------");

    }


}


