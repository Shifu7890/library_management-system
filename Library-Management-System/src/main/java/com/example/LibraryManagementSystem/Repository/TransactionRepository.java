package com.example.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LibraryManagementSystem.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {


}