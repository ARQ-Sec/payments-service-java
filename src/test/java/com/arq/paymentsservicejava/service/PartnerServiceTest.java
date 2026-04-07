package com.arq.paymentsservicejava.service;

import com.arq.paymentsservicejava.repository.PartnerRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PartnerServiceTest {
    @Test
    void returnsSeedData() {
        PartnerService service = new PartnerService(new PartnerRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
