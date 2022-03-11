import java.util.HashMap;
import java.util.Map;



public class App {

  public static void main(String args[]) {

    Map<String, Integer> stockPrice = new HashMap<>();

    stockPrice.put("Oracle", 56);
    stockPrice.put("Fiserv", 117);
    stockPrice.put("BMW", 73);
    stockPrice.put("Microsoft", 213);

    System.out.println(stockPrice.containsKey("Oracle"));

    System.out.println(stockPrice.containsValue(73));
  }
}
