import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  static int N,p,q;
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String line;
    String[] lines;
    line = sc.nextLine();
    line= line.trim();
    lines = line.split("\\s+");
     N = Integer.parseInt(lines[0]);
     p = Integer.parseInt(lines[1]);
     q= Integer.parseInt(lines[2]);
      System.out.println(N+" "+p+" "+q);
      for(int i=N;i>0;i--)
    {
       // System.out.println(i);
      boolean check = printall(i);
      if(check)
      {
        System.out.print("OUTTHINK,");
      }
      else if(i%p!=0)
      {
          int j=i;
        while(j>0)
        {
          if(j%p==q)
          {
            System.out.print("THINK,");
          }
          j=j/10;
        }
      }
     else if(i%p==0)
      {
        System.out.print("OUT,");
      }
      else
      {
         System.out.print(i+",");
      }
    }
    String a = "abc";
      TreeSet<String> set = new TreeSet<>();
      set.add("abs");
      set.add("bds");
      set.add("sjvbsj");
      set.add("dfgf");
      set.tailSet("b",true).stream().limit(2).forEach(System.out::println);
  }
  public static boolean printall(int j)
  {
      boolean t=false;
               if(j%p==0){
             while(j>0)
              {
                 if(j%p==q){
                      t=true;
                      break;
                 }
                 else
                 {
                     t= false;
                 }
                  j=j/10;
                      }
               }
         return  t;
        }
  
}
