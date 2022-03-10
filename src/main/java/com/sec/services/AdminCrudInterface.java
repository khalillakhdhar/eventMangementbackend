package com.sec.services;

import java.util.List;
import java.util.Optional;

import com.sec.model.Admin;

public interface AdminCrudInterface {
public List<Admin> afficheAdmins();
public Admin saveAdmin(Admin admin);
public Optional<Admin> findAdmin(long id);

}
