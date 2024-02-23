package week1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lst = List.of("A", "B", "C");

        // 1
        for (String s: lst) {
            System.out.println(s);
        }

        // 2
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        // 3
        System.out.println(lst);

        // 4
        var it = lst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 5
        lst.forEach(System.out::println);


    }
}
