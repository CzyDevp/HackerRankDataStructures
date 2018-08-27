/**
 * @author Navjot
 */
public class GenerixSolution {
        public static void main(String[] args){
            for(int i=1;i<=100;i++)
                System.out.println(i%5==0?(i%7==0?"Generix Group":"Generix"):i%7==0?"Group":String.valueOf(i));
        }
    }

