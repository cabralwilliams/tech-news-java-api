package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //A repository in Java is any class that fulfills the role of a data access object (DAO)—in other words, it contains data retrieval, storage, and search functionality.

    User findUserByEmail(String email) throws Exception;
}
