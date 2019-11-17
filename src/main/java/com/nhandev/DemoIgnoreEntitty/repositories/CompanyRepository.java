package com.nhandev.DemoIgnoreEntitty.repositories;

import com.nhandev.DemoIgnoreEntitty.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Company findByCompanyId(int companyId);
}
