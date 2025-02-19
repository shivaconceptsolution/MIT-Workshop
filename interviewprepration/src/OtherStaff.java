public class OtherStaff extends Admin{
    int bonus;
    void accept2(int bonus)
    {
        super.accept(1);
        this.bonus = bonus;

    }
    void display2()
    {
        super.display();
        System.out.println(bonus);
    }
    public static void main(String [] args){
        OtherStaff staff = new OtherStaff();

       // staff.accept1("xyz");
        staff.accept2(2000);

      //  staff.display1();
        staff.display2();
    }
}
