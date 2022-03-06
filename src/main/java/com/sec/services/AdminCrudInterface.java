package com.sec.services;

import java.util.List;

import com.sec.model.Admin;

public interface AdminCrudInterface {
public List<Admin> afficheAdmins();
public Admin saveAdmin(Admin admin);

}
