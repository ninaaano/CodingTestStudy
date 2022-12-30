package 연습;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSet {
    public static void main(String[] args) {

        ArrayList<String> a1 =  new ArrayList<>();
        a1.add("one");
        a1.add("two");
        a1.add("one");
        Iterator ai = a1.iterator();
        while(ai.hasNext()) {
            System.out.println(ai.next());
        }

        // 중복을 허용하지 않는다
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("one");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
