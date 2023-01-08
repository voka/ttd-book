package study.ttd.example;

import lombok.Getter;
import study.ttd.example.Money.Money;

@Getter
public class Sum implements Expression{

  Money augend;
  Money addend;

  public Sum(Money augend, Money addend) {
    this.augend = augend;
    this.addend = addend;
  }

  @Override
  public Money reduce(String to) {
    int amount = augend.getAmount() + addend.getAmount();
    return new Money(amount, to);
  }
}
