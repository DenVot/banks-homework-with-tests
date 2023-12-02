package org.denvot.banks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CurrenciesConverterTest {
  @ParameterizedTest
  @CsvSource({
          "1, 1, 1",
          "1, 2, 0.5",
          "2, 1, 2",
          "2, 2, 1"
  })
  public void convertTest(int k1, int k2, double expected) {
    Currency cur1 = new Currency("CUR1", k1);
    Currency cur2 = new Currency("CUR2", k2);

    assertEquals(expected, CurrenciesConverter.ConvertFromOriginalToTarget(1, cur1, cur2));
  }
}