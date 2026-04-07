package com.arq.paymentsservicejava.service;

import com.arq.paymentsservicejava.dto.PartnerResponse;
import com.arq.paymentsservicejava.repository.PartnerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {
    private final PartnerRepository repository;

    public PartnerService(PartnerRepository repository) {
        this.repository = repository;
    }

    public List<PartnerResponse> summarize() {
        return repository.findAll().stream().map(record -> new PartnerResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
