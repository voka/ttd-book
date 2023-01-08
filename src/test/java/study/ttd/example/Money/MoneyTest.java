package study.ttd.example.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.ttd.example.Bank;
import study.ttd.example.Expression;

@SpringBootTest
public class MoneyTest {

  @Test
  public void testEquality(){
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertFalse(Money.franc(5).equals(Money.dollar((5))));
  }

  @Test
  public void testCurrency(){
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }

  @Test
  public void testSimpleAddition(){
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum,"USD");
    assertEquals(Money.dollar(10),reduced);
  }



}
