package com.nhandev.DemoIgnoreEntitty.Services;

import com.nhandev.DemoIgnoreEntitty.models.Company;
import com.nhandev.DemoIgnoreEntitty.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements ICompanyService{
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public List<Company> getListCompany() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> findOne(int companyId) {
        return companyRepository.findById(companyId);
    }
}
