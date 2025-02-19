public class BankTransaction extends  Bank{

    @Override
    void credit() {
       System.out.println("credit");
    }

    @Override
    void debit() {
     System.out.println("debit");
    }

    @Override
    void checkBalance() {
    System.out.println("check balance");
    }
}
