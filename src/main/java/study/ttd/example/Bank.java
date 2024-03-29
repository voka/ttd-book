package study.ttd.example;

import java.util.Hashtable;
import study.ttd.example.Money.Money;

public class Bank {

  private Hashtable rates = new Hashtable<>();

  public Money reduce(Expression source, String to) {
    // 클래스를 명시적으로 검사하는 코드가 있을 경우에는 항상 다형성을 사용하도록 바꾸는 것이 좋다.
//    if (source instanceof Money) return (Money) source;
//    Sum sum = (Sum) source;

//    int amount = sum.getAugend().getAmount() + sum.getAddend().getAmount();
//    return new Money(amount,to);
    return source.reduce(this,to);
  }

  public void addRate(String from, String to, int rate){
    rates.put(new Pair(from,to), rate);
  }
  public int rate(String from, String to){
    if (from.equals(to)) return 1;
    int rate = (int) rates.get(new Pair(from,to));
    return rate;
//    return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
  }

  private class Pair {
    private String from;
    private String to;

    public Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    public boolean equals(Object obj) {
      Pair pair = (Pair) obj;
      return from.equals(pair.from) && to.equals(pair.to);
    }
    public int hashCode(){
      return 0;
    }
  }
}
