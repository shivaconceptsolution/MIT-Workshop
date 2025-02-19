public abstract class Bank {
    int amount=12000;
    void bankInfo()
    {
        System.out.println("Bank Information");
    }
   abstract void credit();
   abstract void debit();
   abstract  void checkBalance();
}
