import java.util.Scanner;

/**
 * Created by Waheguru on 6/29/2017.
 */
public class Stringfrq {
    public static void main(String args[]) {
        String source, find;
        int j;
        j = 0;
        System.out.println("Please enter your String here");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        source = sc.nextLine();
        String[] dest = new String[source.length()];
        dest = source.split("\\s");
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("Please enter your Sub-String to find frequency");
        sc.reset();
        find = sc.nextLine();
        System.out.println("String is " + find);
        //   if (Arrays.asList(dest).contains(find));
        for(int i =0;i<dest.length;i++)
        {
            if(dest[i].equals(find)== true)
            {
                j++;
            }
        }
        System.out.print("Frequency of String is " + j);
    }
}
