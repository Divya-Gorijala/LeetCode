package tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet);
        treeSet.add(6);
        System.out.println(treeSet);

        Set<String> wordSet= new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        Set<String> wordSet2= new TreeSet<>(Comparator.comparing(String::length));
        wordSet2.add("tiger");
        wordSet2.add("giraffe");
        wordSet2.add("bear");
        System.out.println(wordSet2);
    }

}
