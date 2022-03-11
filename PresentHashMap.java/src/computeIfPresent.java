import java.util.HashMap;
import java.util.Map;

public class computeIfPresent {
  public static void main(String args[]) {

    Map<String, Integer> map = new HashMap<>();
    map.put("Taraba", 6);
    map.put("Edo", 3);
    map.put("Osun", 4);
    map.put("Oyo", 3);

    // This will increment the value of Osun by 1 as it is present in the Map
    map.computeIfPresent("Osun", (k, v) -> v == null ? 10 : v + 1);

    // This will not insert Ohio in the Map. 
    map.computeIfPresent("Ohio", (k, v) -> v == null ? 7 : v + 1);

    System.out.println(map);
  }
}
