package com.sec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.Admin;
import com.sec.repository.AdminRepository;

@Service
public class AdminCrudImplement implements AdminCrudInterface {
@Autowired
AdminRepository adminRepository;
	
	@Override
	public List<Admin> afficheAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

}
