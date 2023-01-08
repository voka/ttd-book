package study.ttd.example;

import lombok.Getter;
import study.ttd.example.Money.Money;

@Getter
public class Sum implements Expression{

  Expression augend;
  Expression addend;

  public Sum(Expression augend, Expression addend) {
    this.augend = augend;
    this.addend = addend;
  }

  @Override
  public Money reduce(Bank bank, String to) {
    int amount = augend.reduce(bank,to).getAmount() + addend.reduce(bank,to).getAmount();
    return new Money(amount, to);
  }

  @Override
  public Expression plus(Expression tenFrancs) {
    return null;
  }
}
