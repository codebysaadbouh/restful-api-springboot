package com.manage.user.dao;

import com.manage.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository <User, Integer> {

}
