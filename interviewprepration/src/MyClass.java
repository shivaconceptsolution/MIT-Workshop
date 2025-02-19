public class MyClass implements Area,MathOpe {

    @Override
    public void triangleArea() {
        System.out.println("Triangle Area");
    }

    @Override
    public void divide(int a, int b) {
      System.out.println("Divide "+(a/b));
    }
    public static void main(String[] args) {
        Area myArea = new MyClass();
        myArea.triangleArea();
    }
}
