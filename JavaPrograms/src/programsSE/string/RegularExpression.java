package programsSE.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String args[]){

        Pattern p = Pattern.compile("..s");
        Matcher m = p.matcher("ags");
        boolean b = m.matches();

        boolean b2=Pattern.compile(".s").matcher("as").matches();

        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b+" "+b2+" "+b3);
    }
}
