package com.sec.services.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.Admin;
import com.sec.services.AdminCrudImplement;

@RestController
@Transactional
@CrossOrigin(origins = "localhost:4200")
@RequestMapping("admin")
public class AdminController {
@Autowired
AdminCrudImplement adminapi;
@GetMapping
public List<Admin> findadmins()
{
return adminapi.afficheAdmins();	

}
@PostMapping
public Admin saveAdmin(Admin admin)
{
return adminapi.saveAdmin(admin);	
}
}
