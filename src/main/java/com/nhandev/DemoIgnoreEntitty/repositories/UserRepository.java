package com.nhandev.DemoIgnoreEntitty.repositories;

import com.nhandev.DemoIgnoreEntitty.models.Company;
import com.nhandev.DemoIgnoreEntitty.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByCompany(Company company);
}
