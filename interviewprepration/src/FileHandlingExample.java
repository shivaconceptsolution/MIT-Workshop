import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException {
        File f =  new File("d://mitnew.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        String message;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");

        message=sc.nextLine();
        bw.write(message);
        bw.close();
    }
}
