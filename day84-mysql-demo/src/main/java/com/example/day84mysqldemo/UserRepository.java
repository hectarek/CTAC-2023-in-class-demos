package com.example.day84mysqldemo;

import com.example.day84mysqldemo.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

//    List<User> findByName(String name);
//
//    User findById(long id);

}
