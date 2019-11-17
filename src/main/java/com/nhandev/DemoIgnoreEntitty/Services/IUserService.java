package com.nhandev.DemoIgnoreEntitty.Services;

import com.nhandev.DemoIgnoreEntitty.models.Company;
import com.nhandev.DemoIgnoreEntitty.models.User;

import java.util.List;
public interface IUserService {
    List<User> findAll();
    List<User> findByCompany(Company company);
}
