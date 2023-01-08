package study.ttd.example;

import study.ttd.example.Money.Money;

public class Bank {


  public Money reduce(Expression source, String to) {
    // 클래스를 명시적으로 검사하는 코드가 있을 경우에는 항상 다형성을 사용하도록 바꾸는 것이 좋다.
//    if (source instanceof Money) return (Money) source;
//    Sum sum = (Sum) source;

//    int amount = sum.getAugend().getAmount() + sum.getAddend().getAmount();
//    return new Money(amount,to);
    return source.reduce(to);
  }
}
