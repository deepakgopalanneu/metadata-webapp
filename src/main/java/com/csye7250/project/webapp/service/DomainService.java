package com.csye7250.project.webapp.service;

import com.csye7250.project.webapp.entity.Domain;
import com.csye7250.project.webapp.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainService {
    @Autowired
    private DomainRepository domainRepository;

    public List<Domain> getAllDomains() {
        List<Domain> list = new ArrayList<>();
        domainRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
}
