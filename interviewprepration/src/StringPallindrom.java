public class StringPallindrom {
    public static void main(String[] args) {
        String s = "kkkkkkkkkkkkkkkkkkkkkkk";
        String s1 = "pallindrom";
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
           if(s.charAt(i)!=s.charAt(j)){
              s1="not pallindrom";
               break;
           }
        }
        System.out.println(s1);
    }
}
