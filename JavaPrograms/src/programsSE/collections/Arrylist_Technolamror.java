package programsSE.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist_Technolamror {

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Rajendra");
        list.add("Mahendra");
        list.add("Raja");
        list.add("Technolamror");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
