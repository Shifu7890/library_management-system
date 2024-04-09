package com.example.LibraryManagementSystem.Repository;

import org.springframework.stereotype.Repository;

import com.example.LibraryManagementSystem.Entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    Author findByEmail(String email);
}

