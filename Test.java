package leetcode;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<String>set1 = new HashSet();
        set1.add("86995682-732c-4341-b24a-027d7a4ee843");

        HashSet<String>set2 = new HashSet<>();
        set2.add("078770f7-69f8-42e5-890f-e873531ee961");
        set2.add("6bc9d0b6-f7de-4023-a862-4925db5d74cd");

        set2.removeAll(set1);
        //set2.retainAll(set1);

        set2.forEach(x -> System.out.println(x));
    }
}
