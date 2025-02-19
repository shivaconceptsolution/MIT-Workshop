public class OOPSIMP {
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public OOPSIMP(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("main");
        OOPSIMP obj = new OOPSIMP();

    }
}
