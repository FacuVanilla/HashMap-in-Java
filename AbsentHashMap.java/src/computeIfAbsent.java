import java.util.HashMap;
import java.util.Map;

public class computeIfAbsent {

 public static void main(String args[]) {

    Map<String, Integer> map = new HashMap<>();
    map.put("Nigeria", 7);
    map.put("Ghana", 5);
    map.put("Togo", 4);
    map.put("Cameroon", 8);

    map.computeIfAbsent("Gambia", k -> k.length());

    System.out.println(map);

  }
}
