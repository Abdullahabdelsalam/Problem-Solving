package programsSE.file;

import java.io.FileOutputStream;

public class FileOutputStreamExa {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success.. by Technolamror.");
        }catch(Exception e){System.out.println(e);}
    }
}
