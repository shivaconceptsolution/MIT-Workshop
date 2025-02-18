import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

       int num=2;
       int i;
       for(i=2;i<=num/2;i++){
           if(num%i==0){
              System.out.println("not prime");
              break;
           }
       }
       if(num==i || num==2 || num==3)
       {
           System.out.println("Prime number ");
       }

    }
}