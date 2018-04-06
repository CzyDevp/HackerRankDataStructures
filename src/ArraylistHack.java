import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines you want");
        int n = in.nextInt();
        int d, q, x, y;
        ArrayList[] set = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            d = in.nextInt();
            set[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                set[i].add(in.nextInt());
            }
        }
        System.out.println("Enter number of Queries");
        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            x = in.nextInt();
            y = in.nextInt();
            try {
                System.out.println(set[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
