public class PatternNew {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            int a=1,b=0;
            for(int j=1;j<=6-i;j++){
               if(j%2!=0)
               {
                   System.out.print(a+" ");
                   a=0;
               }
               else {
                   System.out.print(b+" ");
                   b=1;
               }
            }
            System.out.println();
        }
    }
}
