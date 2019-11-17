package com.nhandev.DemoIgnoreEntitty.Services;

import com.nhandev.DemoIgnoreEntitty.models.Company;
import com.nhandev.DemoIgnoreEntitty.models.User;
import com.nhandev.DemoIgnoreEntitty.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByCompany(Company c) {
        return userRepository.findByCompany(c);
    }
}
