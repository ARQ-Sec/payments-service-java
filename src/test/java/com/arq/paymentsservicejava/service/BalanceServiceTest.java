package com.arq.paymentsservicejava.service;

import com.arq.paymentsservicejava.repository.BalanceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BalanceServiceTest {
    @Test
    void returnsSeedData() {
        BalanceService service = new BalanceService(new BalanceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
