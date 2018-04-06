public class GenericFunc {
    public static void main(String[] args)
    {
        Integer[] a = {1,2,3,4,5};
        String[] s1 = {"Hey","Hello" ,"Bye"};
        printArray(a);  //call with integere
        System.out.println("String Print");
        printArray(s1); //call with strings
    }

    //generic function
  public  static   <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.println(element);
        }
    }
}
