package homeworks.bankAccountExample;


//
//        Create a new module within the bank project called Transaction activities
//        for specific customer. Activity object should include, Date, Amount, Merchant Name, Type etc

public class TransactionActivities {
    //Declares date variable
    private String date;
    //Declares remain user balance variable
    private double remainBalance;
    //Declares transactionAmount variable
    private double transactionAmount;
    //Declares customerName variable
    private String customerName;
    //Declares enum typeTransaction
    private TransactionTypes typeTransaction;


    //Constructor for transaction activities class
    public TransactionActivities(String customerName, String date, TransactionTypes typeTransaction, double transactionAmount, double remainBalance) {
        this.date = date;
        this.remainBalance = remainBalance;
        this.transactionAmount = transactionAmount;
        this.customerName = customerName;
        this.typeTransaction = typeTransaction;
    }


    //Getters block
    public double getRemainBalance() {
        return remainBalance;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public TransactionTypes getTypeTransaction() {
        return typeTransaction;
    }  //end of getters block

    //Converts all types variables toString
    @Override
    public String toString() {

        return "Customer name: " + customerName + " | Transaction time: " + date  + " | Transaction type: " + typeTransaction + " | Transaction amount: "+ transactionAmount + " | Remain balance: " + remainBalance + "\n";


    }


}

