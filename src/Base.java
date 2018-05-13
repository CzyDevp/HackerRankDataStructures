   public abstract class Base {
       int x = 3;
       public Base() {
         x += 2;
         System.out.print("-x" + x);
         x++ ;
       }
    abstract int calculate();
    abstract int calculate(int i);
   }
 
class SuperA extends Base {
    int x = 1;
    public SuperA() {
      System.out.print("-x" + calculate(2));
    }
    int calculate(){
      return x;
    }
    int calculate(int i){
      return(calculate() + i);
   }
}
 
 class Sub extends SuperA {
   Sub(){
      x += 3;
   }
   int calculate(){
      return x + 6;
   }
   public static void main(String[] args){
      Sub sub = new Sub();
      System.out.print("-x" + sub.calculate());
   }
}