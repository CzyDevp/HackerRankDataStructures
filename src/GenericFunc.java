public class GenericFunc {
    public static void main(String[] args)
    {
        Integer[] a = {1,2,3,4,5};
        String[] s1 = {"Gagan","Fuck u" ,"tonight"};
        printArray(a);
        System.out.println("String Print");
        printArray(s1);
    }
  public  static   <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.println(element);
        }
    }
}
