package com.dxc.training.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.dxc.training.rest.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
