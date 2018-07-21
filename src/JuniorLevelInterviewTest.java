import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class JuniorLevelInterviewTest {
    public String s;
    public List<Integer> indices;
    public JuniorLevelInterviewTest(String s){
        this.s=s;
        indices = new LinkedList<>();
        for(int i=0;i<this.s.length();++i){
            indices.add(i);
        }
    }
    public static void main(String[] args){
        boolean b= false;
        System.out.println((b=true)?"true": "false");
        Double d = null;
        System.out.println((d instanceof Double)? "true": "false");
        String e = "I";
        System.out.println(("I" == e)? "true":"false");
        //java8
        Supplier<String> i = ()->"Car";
        Consumer<String> c = x-> {x = x.toLowerCase();
            System.out.println(x);};
        Consumer<String> dd = x->x.toUpperCase();
        c.accept(i.get());
        Stream.of(new JuniorLevelInterviewTest("Mercury"),new JuniorLevelInterviewTest("Venus"),new JuniorLevelInterviewTest("Earth"))
                   .flatMap(ints-> ints.indices.stream())
                   .mapToInt(j->j)
                   .max()
                   .ifPresent(s->System.out.println(s));
        int a = 2;
        switch (a){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
        String str = "ok";
        String str1 = new String("ok");
        System.out.println(str.equals(str1));
        System.out.println(str==str1);
        System.out.println(str.hashCode()==str1.hashCode());
        System.out.println(str.matches(str1));
     }

}
