import java.io.*;

public class FileHandlingReadOperation {
    public static void main(String[] args) throws IOException {
        File f = new File("d://mitnew.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s= br.readLine())!=null){
            System.out.println(s);
        }
    }
}
