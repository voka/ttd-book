package study.ttd.example.Money;

import lombok.ToString;
import study.ttd.example.Expression;

@ToString
public class Money implements Expression{
  // 요놈을 protected 로 정의해야 이 추상 클래스를 사용하는 객체들에서 멤버 변수에 접근 할 수 있다.
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Money dollar(int amount) {
    return new Money(amount,"USD");
  }

  public static Money franc(int amount) {
    return new Money(amount,"CHF");
  }

  public Money times(int multiplier) {
    return new Money(this.amount * multiplier, currency);
  }

  public boolean equals(Object object){
    Money money = (Money) object;
    return amount == money.amount && this.currency.equals(money.currency);
  }

  public String currency(){
    return currency;
  }

  public Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }
}
