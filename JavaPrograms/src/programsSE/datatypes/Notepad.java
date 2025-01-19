package programsSE.datatypes;

import java.io.IOException;

public class Notepad {
    public static void main(String[] args) {
        Runtime runtime  = Runtime.getRuntime();

        try {
            runtime .exec("notepad");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
