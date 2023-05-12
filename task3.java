import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
   

public class task3 {
    public static void main(String[]args) {
        ex1();
    }

    static void ex1() {
    /**
     Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
    */
    List<Integer> list = createList(10,4,10);
    System.out.println(list);
    
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random()*(max-min+1)+min));
        }
        return list;
    }

    static List<Integer> deletEvenNum(List<Integer>list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
        }
        System.out.println(list.toString());
        return list;
        }
    }
}