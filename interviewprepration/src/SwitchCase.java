public class SwitchCase {
    public static void main(String[] args) {
        int num=45;
        switch(num%2)
        {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
                break;
        }
    }
}
