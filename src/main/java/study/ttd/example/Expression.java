package study.ttd.example;

import study.ttd.example.Money.Money;

public interface Expression {
  Money reduce(Bank bank, String to);
}
