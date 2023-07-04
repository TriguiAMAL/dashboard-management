package com.example.dashboardmanagement.repository;

import com.example.dashboardmanagement.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long>{}
