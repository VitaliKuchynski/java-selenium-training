package classwork.bankAccountExample;

/**
 * Created by vitalikuchynski on 12/16/17.
 */
public class Main {

    public static void main (String [] arg){

        //Instance of Customer howard
        Customer howard = new Customer();
        //Sets first name
        howard.firstName = "Howard";
        //Sets second name
        howard.secondName = "Guzman";
        //Sets balance
        howard.addAccount(1000);

        //Instance of Customer vitali
        Customer vitali = new Customer();
        //Sets first name
        vitali.firstName = "Vitali";
        //Sets second name
        vitali.secondName = "Semenov";
        //Sets balance
        vitali.addAccount(1000);


    }
}
