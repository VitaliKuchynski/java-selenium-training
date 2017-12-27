package homeworks.bankAccountExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Customer {
    //Declares variable firstName
    private String firstName;
    //Declares variable secondName
    private String secondName;
    //Declares variable acc with type Account
    private Account acc;
    //Initialises default balance
    static int defaultBalance = 100;


    //Gets and first and last name for customer
    public Customer(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    //Default constructor if user does not give name
    public Customer() {
        firstName = "John";
        secondName = "Doe";
    }
    //Adds users account and sets initial balance, user ID
    public void addAccount(double initialBalance) throws IOException {
        //Instance of Account
        acc = new Account();
        //Gets and passes customer name to account class
        acc.setCustomerName(firstName);
        //Gets account ID and increments it
        acc.setAccountId("Account ID" + Account.getNextId());
        //Assignees initialBalance to the balance variable
        acc.setBalance(initialBalance);
        //Prints account details
        acc.displayAccountDetails();

//        //Creates instance of transaction activities and passes  customerName, Date, TransactionTypes, transaction amount and balance
//        TransactionActivities transactionActivities = new TransactionActivities(acc.getCustomerName(), acc.getDate(),TransactionTypes.INITIALISATION,initialBalance, initialBalance);
//        //Adds transaction activities object to Array
//        acc.tr.add(transactionActivities);
//        //Writes to a file
//        acc.output.write(String.valueOf(acc.tr));
//        //Close writer
//        acc.output.close();


    }

    //Adds default value if the balance there is no initialBalance
    public void addAccount() throws IOException {
        addAccount(defaultBalance);
    }

    //Subtracts amount from user balance
    public void withdraw(double withdrawAmount)  {
        acc.withdraw(withdrawAmount);
    }


    //Adds deposit to user account
    public void deposit(double depositAmount) {
        acc.deposit(depositAmount);
    }


    //Transfers amount to another account
    public void transferTo(double transferAmount, int ROUTING_NUMBER, String bankName) {
        try {
            acc.transferSend(transferAmount,ROUTING_NUMBER,bankName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Reads and prints transaction activities from the file TransactionHistory.txt
    public  void printTransactionActivities()  {

        //Initialises string variable passes file to read
        String fileName = "TransactionHistory.txt";
        //Declares String variable
        String line;
        //Instance of ArrayList
        ArrayList trOut = new ArrayList();
        //Reads line of text from file into Array
        try {
            //Instance of buffer rider gets file from instance of file rider
            BufferedReader input = new BufferedReader(new FileReader(fileName));
            //Check if the file can be read
            if (!input.ready()) {
                throw new IOException();
            }
            //Reads line of text
        while ((line = input.readLine()) !=null) {
                //Adds to array
                trOut.add(line );

            }
            //Close stream
            input.close();
            //Catch problem whether file not found or it empty
        }catch (IOException e){

            System.out.println("There is no any user history.");
        }
        System.out.println("------------------");
        //Initialise variable and assigns array size
        int sz =trOut.size();
        //Gets size of array and prints every index of it using for loop
        for (int i = 0; i < sz; i++){
            System.out.println(trOut.get(i).toString());

         }
    }

}










