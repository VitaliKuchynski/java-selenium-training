package homeworks.bankAccountExample;
import java.io.IOException;

public class Main {

    public static void main (String [] arg) throws IOException {

        Customer semen = new Customer("Semen", "Semenov");
        semen.addAccount(5000);
        semen.withdraw(100);
        semen.transferTo(150,1234,"CHAse");
        //semen.printTransactionActivities();




    }
}
