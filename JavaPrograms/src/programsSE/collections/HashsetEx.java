package programsSE.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {
    public static void main(String args[]){

        HashSet<String> set=new HashSet<String>();
        set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi");
        set.add("Technolamror");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
