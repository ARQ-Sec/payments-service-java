package com.arq.paymentsservicejava.service;

import com.arq.paymentsservicejava.repository.PayoutRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PayoutServiceTest {
    @Test
    void returnsSeedData() {
        PayoutService service = new PayoutService(new PayoutRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
