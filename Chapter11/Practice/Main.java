public class Main {
  public static void main(String[] args) {
    Book book = new Book("幸せになる勇気", 1200, "赤", "3232-31232-3213");
    Computer c = new Computer("幸せになる勇気", 1200, "赤", "3232-31232-3213");
    System.out.println(book.getPrice());
    System.out.println(c.getMakerName());
    book.setWeight(34.3);
    System.out.println(book.getWeight());
  }
}