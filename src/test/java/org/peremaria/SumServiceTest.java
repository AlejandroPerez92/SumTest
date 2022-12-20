package org.peremaria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumServiceTest {
    private SumService service;

    @BeforeEach
    void setUp() {
        this.service = new SumService();
    }

    @Test
    void GivenTwoEqualsNumbersWhenSumItThenReturnTheDouble() {
        int number = 1;
        int result = this.service.sum(number, number);
        Assertions.assertEquals(2,result);
    }

}
