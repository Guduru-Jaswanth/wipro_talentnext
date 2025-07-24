package oops;
import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");

        StringJoiner s2 = new StringJoiner("-", "[", "]");
        s2.add("Kolkata");
        s2.add("Hyderabad");

        // i) s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-", "[", "]");
        merge1.merge(s2);
        merge1.merge(s1);
        System.out.println("i) s1 merged to s2: " + merge1);

        // ii) s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-", "[", "]");
        merge2.merge(s1);
        merge2.merge(s2);
        System.out.println("ii) s2 merged to s1: " + merge2);
    }
}
