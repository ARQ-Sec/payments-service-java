package com.arq.paymentsservicejava.repository;

import com.arq.paymentsservicejava.domain.SettlementRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class SettlementRepository {
    private final Map<String, SettlementRecord> storage = new ConcurrentHashMap<>();

    public SettlementRepository() {
        storage.put("settlement-seed", new SettlementRecord("settlement-seed", "settlement-owner", "eu-central", Instant.now()));
    }

    public Collection<SettlementRecord> findAll() {
        return storage.values();
    }
}
