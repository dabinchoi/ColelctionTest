package my.examples.javaexam;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CollectionTest01 {
    public static void main(String[] args){//
        //Collection<String> collection = new HashSet<>(); //실제 구현 객체
        Set<String> set = new HashSet<>();
        //  Collection<String> collection = new ArrayList<>();//순서대로 뜸.
/*        boolean flag = false;
        flag = set.add("hello");
        System.out.println(flag);
        flag = set.add("!!!");
        System.out.println(flag);
        flag = set.add("!!!");
        System.out.println(flag);*/




        set.add("hello");
        set.add("world");
        set.add("!!!");//false를 리턴한다.

        //set.add("hello");
        //set.add("world");
        //set.add("!!!");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
