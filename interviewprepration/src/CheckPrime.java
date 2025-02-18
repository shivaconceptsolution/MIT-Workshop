public class CheckPrime {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {

            for(int j=1,asc=65;j<=6-i;j++,asc++){
                if(i%2!=0)
                  System.out.print((char)asc+" ");
                else
                    System.out.print((char)(asc+32) + " ");

            }
            System.out.println();
        }
    }
}
