package com.example.multiplicationboot.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User , Long> {
    Optional<User> findById(Long aLong);
    Optional<User> findByAlias(String alias);
}
