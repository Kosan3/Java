import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<>();
    prefs.put("埼玉県", 1);
    prefs.put("東京都", 2);
    prefs.put("神奈川県", 3);
    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      System.out.print("keyは" + key + " valueは" + value + "  ");
    }
  }
}