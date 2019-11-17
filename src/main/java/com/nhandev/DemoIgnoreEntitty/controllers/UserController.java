package com.nhandev.DemoIgnoreEntitty.controllers;

import com.nhandev.DemoIgnoreEntitty.Services.ICompanyService;
import com.nhandev.DemoIgnoreEntitty.Services.IUserService;
import com.nhandev.DemoIgnoreEntitty.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    ICompanyService companyService;
    @GetMapping
    public ResponseEntity<?> findAllProject(@RequestParam(value = "idCompany") Integer idCompany){
        Optional<Company> company = companyService.findOne(idCompany);
        if(!company.isPresent()) {


        }

        return ResponseEntity.ok(userService.findByCompany(company.get()));
    }
}
