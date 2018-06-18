import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MultithreadAssignment {
public static void main(String[] args){
	List<String> list;
	try (Stream<String> stream = Files.lines(Paths.get("DataSet.txt")).filter(str->!str.isEmpty())) {
		list=stream.peek(System.out::println)
                   .map(s->s.replaceAll("[{}.]", ""))
                   .map(str-> str.replaceAll("\\,|\\[|\\]"," "))
                   .map(str->str.split("\\s+")).flatMap(Arrays::stream).distinct()
                   .collect(Collectors.toList());
		list.stream().forEach(System.out::println);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}