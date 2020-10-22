public class Main {
  public static void main(String[] args) {
    Y[] values = new Y[2];
    values[0] = new A();
    values[1] = new B();
    for (Y value : values) {
      value.b();
    }
  }
}