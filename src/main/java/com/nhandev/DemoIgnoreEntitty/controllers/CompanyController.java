package com.nhandev.DemoIgnoreEntitty.controllers;

import com.nhandev.DemoIgnoreEntitty.Services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    ICompanyService companyService;
    @GetMapping
    public ResponseEntity<?> findAllProject(){
        return ResponseEntity.ok(companyService.getListCompany());
    }
}
