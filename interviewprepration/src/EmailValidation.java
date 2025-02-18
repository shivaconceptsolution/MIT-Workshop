public class EmailValidation {
    public static void main(String[] args) {
        String email = "ravi@kumargmail.in";
        int atpos = email.indexOf("@");
        int dotPos = email.lastIndexOf(".");
        if (atpos<3 || atpos == -1 || dotPos == -1 || dotPos<atpos || (dotPos-atpos)<3 || email.length()-dotPos<3)
        {
            System.out.println("Invalid email address");
        }
        else{
            System.out.println("Valid email address");
        }
    }
}
