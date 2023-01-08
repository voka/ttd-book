package study.ttd.example.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DollarTest {

  // 달러
  @Test
  public void multiplication(){
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
  }
  @Test
  public void testMultiplication(){
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10),five.times(2));
    assertEquals(Money.dollar(15),five.times(3));
  }


}
