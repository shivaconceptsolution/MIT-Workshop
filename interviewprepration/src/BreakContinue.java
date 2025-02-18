public class BreakContinue {
    public static void main(String[] args) {
      int a=5;
      int b;
      b = a++ + ++a + ++a + --a;
   // 27    5     7    8     7
      System.out.println("b="+b);
      System.out.println("a="+a);
    }
}
