public class Accuqiso {
    static int a=2,b=5;
    public static void main(String[]args){
       // swap(a,b);
        //a=swap(2,5);
        //System.out.println("A is :"+a);
        swap(a,b);
        System.out.println("After swapping A is: "+a+"\nAfter swapping B is: "+b);
        System.out.println();
    }
    private static void swap(int x,int y){
       a=y;
       b=x;
       // return x;
    }

}
