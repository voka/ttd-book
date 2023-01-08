package study.ttd.example;

import study.ttd.example.Money.Money;

public interface Expression {
  Money reduce(Bank bank, String to);

  Expression plus(Expression tenFrancs);

  Expression times(int multiplier);
}
