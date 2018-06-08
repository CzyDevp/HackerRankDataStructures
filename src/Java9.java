import java.util.*;

public class Java9 {
    public static void main(String[] args){
        List<String> prior9 = Arrays.asList("Nav","Singh");   //immutable when exceeds list bounds
        prior9.set(0,"Jimmy");
        prior9.stream().forEach(System.out::println);
        //prior9.add("Kpt");  //un-comment to check an effect of it
        System.out.println("\nJava9");
        List<String> after9 = List.of("Nav", "Singh");   //immutable  java9 way
        //after9.set(0,"Sonu");  //uncomment to check error
        after9.stream().forEach(System.out::println);
        //after9.add("navlamme");   //un-comment to check an effect of it
        //List<String> copy_ater9 = List.copyOf(); jdk10 feature
        Set<String> names_prior9 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("Rubal","Singh")));
        names_prior9.stream().forEach(System.out::print);
        System.out.println("\nJava9");
        Set<String> names = Set.of("Rubal","Jimmy");  //immutable  java9 way
        names.stream().forEach(System.out::println);

        //same for Map.of
        Map<String,String>  names_sex = Map.of("Nav","M",
                                                "Jimmy","M" );
       // names_sex.forEach((k,v)-> System.out.println(k + " "+v));  //print options
        names_sex.entrySet().forEach(e-> System.out.println(e.getKey()+"'s"  + " Sex is: "+ e.getValue()));
    }

}
