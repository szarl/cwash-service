package com.example.cwashservice.repository;
import com.example.cwashservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
