import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution2 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        System.out.println(cats);
        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> ic = cats.iterator();
        if(ic.hasNext())
            cats.remove(ic.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cat = new HashSet<>();
        for (int i = 0; i < 3; i ++)
            cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
//        String name;
    }
}
