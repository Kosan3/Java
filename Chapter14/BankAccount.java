public class BankAccount {
  String accountNumber;
  int balance;

  public BankAccount(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String toString() {
    return "\\" + this.balance + "（口座番号：" + this.accountNumber + "）";
  }

  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof BankAccount) {
      BankAccount ba = (BankAccount)o;
      String ba1 = ba.accountNumber.trim();
      String ba2 = ba.accountNumber.trim();
      if (ba1.equals(ba2)) {
        return true;
      }
    }
    return false;
  }
}