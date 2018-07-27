import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
class StinGrayQuestion2 {
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String input = "Cars1, Cars2 | Cars1, Cars2";
    String inputFinal = br.readLine();
    String[] buffers = inputFinal.split("\\|");
    String[] buffer1 = buffers[0].split(",");
    String[] buffer2 = buffers[1].split(",");
    Map<String, Integer> first = createMap(buffer1);
    Map<String, Integer> second = createMap(buffer2);
    if (first.keySet().size() == second.keySet().size()) {
      if (first.entrySet().containsAll(second.entrySet()))
        System.out.println("true");
      else
        System.out.println("false");
    }
    else
      System.out.println("false");
  }
   static  Map<String,Integer> createMap(String[] buffer){
    Map<String,Integer> map = new HashMap<>();
    for (String str : buffer) {
      if (map.containsKey(str)) {
        map.put(str, map.get(str).intValue() + 1);
      } else {
        map.put(str, 1);
      }
    }
    return map;
  }
}
