import java.io.*;
public class Abcd {
      public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String[] sp = input.split("\\|");
            char[] sp1 = sp[0].toCharArray();
            char[] sp2 = sp[0].toCharArray();
            System.out.println(Match(sp1,sp2));
        }
        static int Match(char[] sp1,char[] sp2){
            String source = sp2.toString();
            for(char ch: sp1){
                if(source.contains(""+ch)){
                    return source.indexOf(ch);
                }
            }
       return -1;
      }
    }

