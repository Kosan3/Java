import java.util.*;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    List<Hero> heros = new ArrayList<>();
    heros.add(h1);
    heros.add(h2);
    for (Hero hero : heros) {
      System.out.println(hero.getName());
    }

    Map<Hero, Integer> lists = new HashMap<>();
    lists.put(h1, 3);
    lists.put(h2, 7);
    for (Hero key : lists.keySet()) {
      int value = lists.get(key);
      System.out.println(key.getName() + "が倒した数=" + value);
    }
  }
}