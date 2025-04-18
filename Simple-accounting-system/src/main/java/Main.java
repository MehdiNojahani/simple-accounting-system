import com.Account.packages.Account;
import com.Account.packages.BankAccount;
import com.Report.packages.ReportGenerator;
import com.Transaction.packages.Transaction;
import com.User.packages.User;

public class Main {
    public static void main(String[] args) {


        Account account1=new BankAccount(100, "MellatBank", 1000);

        User user1=new User(101, "mohammad Alizadeh");

        Transaction t= user1.createTransactionFactory(20, "Income", 300, account1);

        t.execute();

        ReportGenerator reportGenerator=new ReportGenerator();
        reportGenerator.generateAccountSummary(account1);
    }
}
