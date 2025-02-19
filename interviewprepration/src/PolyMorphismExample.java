public class PolyMorphismExample {
    void addition(int a, int b)
    {
        System.out.println("first" + (a+b));
    }
    void addition(int a,float b)
    {
        System.out.println("second" + (a+b));
    }
    void addition(float a,float b)
    {
        System.out.println("third" + (a+b));
    }
    void addition(float a,int b)
    {
        System.out.println("fourth" + (a+b));
    }
    public static void main(String args[]){
        PolyMorphismExample obj = new PolyMorphismExample();
        obj.addition(10.2F,20);
    }
}
