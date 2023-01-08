package study.ttd.example.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FrancTest {

  @Test
  public void testMultiplication(){
    Money five = Money.franc(5);
    assertEquals(Money.franc(10),five.times(2));
    assertEquals(Money.franc(15),five.times(3));
  }

}
