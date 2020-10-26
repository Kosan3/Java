public class Main {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount("1234", 3000);
    BankAccount a = new BankAccount(" 1234", 3000);
    System.out.println(ba);
    System.out.println(ba.equals(a));
  }
}