package com.nhandev.DemoIgnoreEntitty.Services;

import com.nhandev.DemoIgnoreEntitty.models.Company;

import java.util.List;
import java.util.Optional;

public interface ICompanyService {
    List<Company> getListCompany();
    Optional<Company> findOne(int companyId);
}
