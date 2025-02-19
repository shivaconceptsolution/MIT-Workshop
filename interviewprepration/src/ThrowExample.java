public class ThrowExample {
    public static void main(String[] args) {
        int a=10;
        try
        {
            if(a<0)
                throw new ArithmeticException();
            else
                System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter only positive numebrs"    );
        }
    }
}
