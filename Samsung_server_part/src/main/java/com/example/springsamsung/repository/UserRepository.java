package com.example.springsamsung.repository;


import com.example.springsamsung.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< User , Long > {
}
