public class GenericFunc {
    static int a1;
    public static void main(String[] args)
    {
        subclass obj=new subclass();
        obj.displayResult();
        Integer[] a = {1,2,3,4,5};
        System.out.println("A is "+a1);
        String[] s1 = {"Hey","Hello" ,"Bye"};
        printArray(a);  //call with integere
        System.out.println("String Print");
        printArray(s1); //call with strings
    }//updated
  static {
        a1=10;
  }
    //generic function
  public  static   <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.println(element);
        }
    }
}
interface abc {
    int a=10;
}
    class superclass {
    public static void displayResult() {
        System.out.println("Hi by super");
    }
}
    class subclass extends superclass implements abc {
    public static void displayResult() {
        System.out.println("Hi by sub");
        System.out.println(abc.a);
        superclass.displayResult();

    }
  }

