import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * QUESTION 07: Debugging
 * This method remove all even number from a list.
 * But the method is not working properly.
 * Find the error and fix it.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class Debugging {
    public static void main(String[] args) {
        Debugging instance = new Debugging();
        System.out.println(instance.removeEvenNumbers(1, 2, 3, 4));
    }
    private List<Integer> removeEvenNumbers(Integer ... values) {
        // TODO: Fix code here.
       // List<Integer> integers = new CopyOnWriteArrayList<>();      //1 multithreaded env
        List<Integer> integers = new ArrayList<>(Arrays.asList(values)); //2
       /* Iterator itr = integers.iterator();
        while (itr.hasNext()){
            Integer temp = (Integer) itr.next();
            if(temp%2==0){
                itr.remove();
            }
        }*/
      /*  for (Integer i : integers) {
            if (i % 2 == 0) { // remove even numbers
                integers.remove(i);      //try to remove during iteration
            }
        }*/
        integers.removeIf(integer -> integer%2==0);
        return integers;
    }
}