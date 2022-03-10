package com.sec.services.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.Admin;
import com.sec.services.AdminCrudImplement;

@RestController
@Transactional
@RequestMapping("admin")
public class AdminController {
@Autowired
AdminCrudImplement adminapi;
@GetMapping
public List<Admin> findadmins()
{
return adminapi.afficheAdmins();	

}
@GetMapping("/{id}")
public Optional<Admin> getAdmin(@PathVariable long id) // @RequestParam ?
{
return adminapi.findAdmin(id);	

}


@PostMapping
public Admin saveAdmin(@RequestBody Admin admin)
{
return adminapi.saveAdmin(admin);	
}
}
